package ru.tele2.govorova.java.basic.homeworks.homework17;

import java.util.Arrays;

public class ArraySorting {

    public static final int[] bubbleSort(int[] array) {
        if (array.length <= 1)
            return array;

        boolean toChange = true;
        while (toChange) {
            toChange = false;
            for (int i = 0; i < array.length - 1; i++) {
                int temp;
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    toChange = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static final int[] quickSort(int[] array, int lowestElem, int highestElem) {
        if (array.length == 0)
            return array;

        if (lowestElem >= highestElem)
            return array;

        int middleElemInd = lowestElem + (highestElem - lowestElem) / 2;
        int middleElem = array[middleElemInd];

        int i = lowestElem, j = highestElem;
        while (i <= j) {
            while (array[i] < middleElem) {
                i++;
            }

            while (array[j] > middleElem) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
