package ru.tele2.govorova.java.basic.homework;

import java.util.Random;
import java.util.Scanner;

public class MyHomeWork1Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int a = scanner.nextInt();
        if (a == 1) {
            greetings();
        }
        if (a == 2) {
            checkSign();
        }
        if (a == 3) {
            selectColor();
        }
        if (a == 4) {
            compareNumbers();
        }
        if (a == 5) {
            addOrSubtractAndPrint();
        }
    }

    public static void greetings() {
        System.out.println("\nHello \nWorld \nfrom \nJava");


    }

    public static void checkSign() {
        Random r = new Random();
        int a = r.nextInt();
        int b = r.nextInt();
        int c = r.nextInt();
        System.out.println(a + " " + b + " " + c);
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }


    public static void selectColor() {
        Random r = new Random();
        int data = r.nextInt();
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
        Random r = new Random();
        int a = r.nextInt();
        int b = r.nextInt();
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }


    public static void addOrSubtractAndPrint() {
        Random r = new Random();
        int initValue = r.nextInt();
        int delta = r.nextInt();
        boolean increment = Math.random() > 0.5;
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

}
