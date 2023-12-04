package ru.tele2.govorova.java.basic.homeworks.homework14;

public class AppArrayDataException extends Exception {
    public int i;
    public int j;

    AppArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }
}

