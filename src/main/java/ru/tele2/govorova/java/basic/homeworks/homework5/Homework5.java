package ru.tele2.govorova.java.basic.homeworks.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {

        stringPrint("Hello World!", 30);
        arraySumElementsGreater5(new int[]{1, 55, 4, 5, 6, 6});
        arrayFilling(10, 53);
        arrayIncrease(6, 6);
        arraySumSide(new int[]{9, 9, 7, 9, 10, 7, 96});
        arrayReverse(new int[]{1, 2, 3, 4, 5, 6, 8});
        arrayAscendingDescending(new int[]{5, 6, 6, 10});
        sumArrays(new int[]{5, 10}, new int[]{5, 6, 4, 4}, new int[]{5, 6, 4, 10}, new int[]{5, 6, 3, 10}, new int[]{5, 6, 2, 10});
        arrayPoint(new int[]{1, 1, 1, 1, 1, 5});

    }


    public static void stringPrint(String str, int a) {

        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static void arraySumElementsGreater5(int[] a) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 5) {
                sum += a[i];
            }
        }

        System.out.println(sum);
    }

    public static void arrayFilling(int n, int b) {

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = b;
        }

        System.out.println(Arrays.toString(a));
    }


    public static void arrayIncrease(int n, int b) {

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] += b;
        }

        System.out.println(Arrays.toString(a));
    }

    public static void arraySumSide(int[] a) {

        int sum1 = 0;
        int sum2 = 0;
        int n = a.length / 2;
        for (int i = 0; i < a.length; i++) {
            if (i < n) {
                sum1 += a[i];
            } else {
                sum2 += a[i];
            }
        }

        if (sum1 > sum2) {
            System.out.println("Левая сумма больше" + " " + sum1 + ">" + sum2);
        } else if (sum1 < sum2){
            System.out.println("Правая сумма больше" + " " + sum1 + "<" + sum2);
        } else {
            System.out.println("Суммы равны" + " " + sum1 + "=" + sum2);
        }
    }


    public static void arrayReverse(int[] a) {

        int b;
        for (int i = 0; i < a.length / 2; i++) {
            b = a[a.length - i - 1];
            a[a.length - i - 1] = a[i];
            a[i] = b;
        }

        System.out.println(Arrays.toString(a));
    }


    public static void arrayAscendingDescending(int[] a) {

        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите '<', если хотите проверить массив на уменьшение, '>' - на увеличение");
        char operation = scanner.next().charAt(0);

        {
            if (operation == '<') {
                for (int i = 0; i < a.length - 1; i++)
                    if (a[i] <= a[i + 1]) {
                        isTrue = false;
                        break;
                    }
            } else if (operation == '>') {
                for (int i = 0; i < a.length - 1; i++)
                    if (a[i] >= a[i + 1]) {
                        isTrue = false;
                        break;
                    }
            }
        }
        if (isTrue && operation == '<') {
            System.out.println("Строго убывание");
        } else if (!isTrue && operation == '<') {
            System.out.println("Не убывающая последовательность");
        } else if (isTrue && operation == '>') {
            System.out.println("Строго возрастание");
        } else System.out.println("Не возрастающая последовательность");
    }


    public static void sumArrays(int[]... arrays) {

        int maxLength = 0;
        for (int[] array : arrays) {
            if (maxLength <= array.length) {
                maxLength = array.length;
            }
        }

        int[] sumArray = new int[maxLength];
        for (int[] array : arrays) {
            for (int i = 0; i < array.length; i++) {
                sumArray[i] += array[i];
            }
        }

        System.out.println(Arrays.toString(sumArray));
    }


    public static void arrayPoint(int[] array) {

        int sum1 = 0;
        int sum2 = 0;
        int sumArr = Arrays.stream(array).sum();
        boolean mark = false;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
            sum2 = sumArr - sum1;
            if (sum1 == sum2) {
                mark = true;
            }
        }

        if (mark) {
            System.out.println("Точка находится между элементами");
        } else {
            System.out.println("Точки нет между элементами");
        }
    }
}
