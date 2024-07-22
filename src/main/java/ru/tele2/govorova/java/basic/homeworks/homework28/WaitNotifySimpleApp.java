package ru.tele2.govorova.java.basic.homeworks.homework28;

public class WaitNotifySimpleApp {
    private class Counter {
        private int value;
        public void inc() {
            value++;
            System.out.println("Counter value after increment: " +
                    value);
        }
        public void dec() {
            value--;
            System.out.println("Counter value after decrement: " +
                    value);
        }
    }
    private final Object mon = new Object();
    private Counter counter = new Counter();
    public static void main(String[] args) {
        WaitNotifySimpleApp waitNotifyApp = new WaitNotifySimpleApp();
        new Thread(() -> {
            waitNotifyApp.toOne();
        }).start();
        new Thread(() -> {
            waitNotifyApp.toZero();
        }).start();
    }

    public void toOne() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (counter.value != 0) {
                        mon.wait();
                    }
                    counter.inc();
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void toZero() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (counter.value != 1) {
                        mon.wait();
                    }
                    counter.dec();
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

