package ru.tele2.govorova.java.basic.homeworks.homework30;


import java.util.Arrays;

public class Homework30 {
    public static void main(String[] args) {
    }

    public static int[] arrayAfterLastOne(int[] array) throws RuntimeException {
        int indexOfLastOne = -1;
        {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) indexOfLastOne = i;
            }

        }
        if (indexOfLastOne == -1) {
            throw new RuntimeException();
        }
        return Arrays.copyOfRange(array, indexOfLastOne + 1, array.length);
    }


    public static boolean isArrayOfOneTwo(int[] array) {

        boolean isOne = false;
        boolean isTwo = false;
        {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    isOne = true;
                } else if (array[i] == 2) {
                    isTwo = true;
                } else return false;

            }
        }
        return isOne && isTwo;
    }

}

