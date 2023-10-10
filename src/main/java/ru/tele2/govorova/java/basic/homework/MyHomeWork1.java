package ru.tele2.govorova.java.basic.homework;

public class MyHomeWork1 {
    public static void main(String[] args) {
        greetings();
        checkSign(4, 23, -150);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(4, 5, false);
    }

    public static void greetings() {
        System.out.println("\nHello \nWorld \nfrom \nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 1;
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 18;
        int b = 18;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {

        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
