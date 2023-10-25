package ru.tele2.govorova.java.basic.homeworks.homework7;

public class Homework7 {
    public static void main(String[] args) {

        sumOfPositiveElements(new int[][]{{-5, -9, -7, 9, -10, 0, -96}, {-9, -9, 7, -9, -10, -7, -96}, {-9, -9, 7, -9, -10, -7, -96}});
        squareOfStars(5);
        diagonal(new int[][]{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}});
        findMax(new int[][]{{-1, -1 - 1, -1, -1}, {-1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1}, {-1, -1, -1, 1, -1}, {1, 4, 1, 1, 10}});
        sumtwo(new int[][]{{-1, 2}, {3, 3}, {5, 4}});

    }


    public static void sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }

        System.out.println("Сумма положительных элементов двумерного массива = " + sum);
    }


    public static void squareOfStars(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void diagonal(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 0;
                }
                if (i + j == array.length - 1) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j]);
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Mаксимальный элемент массива = " + max);

    }

    public static void sumtwo(int[][] array) {
        int sum = 0;
        boolean isTwo = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i].length < 2) {
                    isTwo = false;
                    break;
                } else if (j == 1) {
                    sum += array[i][j];
                }
            }
        }

        if (!isTwo) {
            System.out.println("-1 - Нет второго столбца");
        } else
            System.out.println("Сумма элементов второго столбца = " + sum);

    }
}
