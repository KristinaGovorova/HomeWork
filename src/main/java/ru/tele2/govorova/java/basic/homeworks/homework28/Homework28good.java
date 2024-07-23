package ru.tele2.govorova.java.basic.homeworks.homework28;

public class Homework28good {


    private char nextChar = 'A';

    private void printChar(char c) {
        System.out.print(c);
    }

    private final Object mon = new Object();

    public static void main(String[] args) {
        Homework28good waitNotifyApp = new Homework28good();
        new Thread(waitNotifyApp::printA).start();
        new Thread(waitNotifyApp::printB).start();
        new Thread(waitNotifyApp::printC).start();
    }

    private void printChar(char currentChar, char nextChar) {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (this.nextChar != currentChar) {
                        mon.wait();
                    }
                    printChar(currentChar);
                    this.nextChar = nextChar;
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void printA() {
        printChar('A', 'B');
    }

    public void printB() {
        printChar('B', 'C');
    }

    public void printC() {
        printChar('C', 'A');
    }
}
