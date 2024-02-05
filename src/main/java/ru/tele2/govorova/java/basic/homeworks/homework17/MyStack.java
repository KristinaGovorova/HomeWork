package ru.tele2.govorova.java.basic.homeworks.homework17;

import java.util.NoSuchElementException;

public class MyStack<T> extends MyLinkedList {

    public void pushStack(T data) {
        Node<T> newNode = new Node<>(data);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }

        size++;
    }

    public T popStackElement() {
        if (last != null) {
            T value = (T) last.item;
            last = last.prev;
            if (last != null) {
                last.next = null;
            } else {
                first = null;
            }
            size--;
            return value;
        } else {
            throw new NoSuchElementException("Стек пуст");
        }
    }
}