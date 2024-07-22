package ru.tele2.govorova.java.basic.homeworks.homework28;

public class Homework28 {


    char[] nextChar = {'A'};

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
                    while (nextChar[0] != 'A') {
                        mon.wait();
                    }
                    printCharA();
                    nextChar[0] = 'B';
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
                    while (nextChar[0] != 'B') {
                        mon.wait();
                    }
                    printCharB();
                    nextChar[0] = 'C';
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
                    while (nextChar[0] != 'C') {
                        mon.wait();
                    }
                    printCharC();
                    nextChar[0] = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
