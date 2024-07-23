package ru.tele2.govorova.java.basic.homeworks.homework28;

public class Homework28 {


    private char nextChar = 'A';

    public void printCharA() {System.out.print('A');}

    public void printCharB() {System.out.print('B');}

    public void printCharC() {System.out.print('C');}

    private final Object mon = new Object();

    public static void main(String[] args) {
        Homework28 waitNotifyApp = new Homework28();
        new Thread(waitNotifyApp::printA).start();
        new Thread(waitNotifyApp::printB).start();
        new Thread(waitNotifyApp::printC).start();
    }

    public void printA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (nextChar != 'A') {
                        mon.wait();
                    }
                    printCharA();
                    nextChar = 'B';
                    mon.notifyAll();

                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void printB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (nextChar != 'B') {
                        mon.wait();
                    }
                    printCharB();
                    nextChar = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void printC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (nextChar != 'C') {
                        mon.wait();
                    }
                    printCharC();
                    nextChar = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
