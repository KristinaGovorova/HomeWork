package ru.tele2.govorova.java.basic.homeworks.homework21;

import javax.swing.plaf.TableHeaderUI;
import java.util.Arrays;

public class Homework21 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Counting in one thread");
        runOneThread();
        System.out.println("Counting in four threads");
        runFourThread();
    }


    public static void runOneThread() {

        double[] array = new double[100000000];
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        System.out.println("It takes " + (System.currentTimeMillis() - startTime) + " to count all elements in one thread");
    }

    public static void runFourThread() throws InterruptedException {
        double[] array = new double[100000000];
        int arrayPart = array.length / 4;

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < arrayPart; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = arrayPart; i < arrayPart*2; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread threadThree = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = arrayPart*2; i < arrayPart*3; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });
        Thread threadFour = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = arrayPart*3; i < array.length; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            }
        });

        long startTime = System.currentTimeMillis();
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();

        threadOne.join();
        threadTwo.join();
        threadThree.join();
        threadFour.join();

        System.out.println("It takes " + (System.currentTimeMillis() - startTime) + " to count all elements in four threads");
    }
}