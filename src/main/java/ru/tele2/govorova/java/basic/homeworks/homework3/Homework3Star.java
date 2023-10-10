package ru.tele2.govorova.java.basic.homeworks.homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        Random r = new Random();
        int a = scanner.nextInt();
        if (a == 1) {
            greetings();
        }
        if (a == 2) {
            checkSign(r.nextInt(), r.nextInt(), r.nextInt());
        }
        if (a == 3) {
            selectColor();
        }
        if (a == 4) {
            compareNumbers();
        }
        if (a == 5) {
            addOrSubtractAndPrint(r.nextInt(), r.nextInt(),Math.random() > 0.5);
        }
    }

    public static void greetings() {
        System.out.println("\nHello \nWorld \nfrom \nJava");

    }

    public static void checkSign(int a, int b, int c) {
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

    public static void addOrSubtractAndPrint(int initValue , int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
