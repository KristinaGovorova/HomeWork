package ru.tele2.govorova.java.basic.homeworks.homework14;

public class Homework14 {
    public static void main(String[] args) {

        String[][] array = new String[][]{{"1", "2", "3", null}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            try {
                int result = arraySum(array);
                System.out.println(result);
            } catch (AppArraySizeException e) {
                e.printStackTrace();
                System.out.println("Размер массива не 4x4");
            }
        } catch (AppArrayDataException e) {
            e.printStackTrace();
            System.out.println("В массиве есть значение не int");
            System.out.println("Неверные данные в ячейке: " + (e.i + 1) + "x" + (e.j + 1)); //в моем идеальном мирке все нумеруется с 1, а не с нуля
        }
    }


    public static int arraySum(String[][] arr) throws AppArraySizeException, AppArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new AppArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new AppArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

}