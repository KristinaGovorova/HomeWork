package ru.tele2.govorova.java.basic.homeworks.homework17;

import java.util.NoSuchElementException;

public class MyQueue<T> extends MyLinkedList {

    public void addElement(T data) {
        addLast(data);
    }

    public T takeElement() {
        if (first != null) {
            T value = (T) first.item;
            first = first.next;
            if (first != null) {
                first.prev = null;
            } else {
                last = null;
            }
            size--;
            return value;
        } else {
            throw new NoSuchElementException("Пустая очередь");
        }
    }
}