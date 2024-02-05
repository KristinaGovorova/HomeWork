package ru.tele2.govorova.java.basic.homeworks.homework17;


public class MyLinkedList<T> {
    protected int size;
    protected Node<T> first;
    protected Node<T> last;

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }

        size++;
    }

    public void addLast(T data) {
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

    public void add(int position, T data) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Нельзя вставить элемент! Индекс выходит за рамки: " + position);
        }
        Node<T> newNode = new Node<>(data);
        int count = 0;

        for (Node<T> current = first; current != null; current = current.next) {
            if (count == position) {

                if (first == null) {
                    first = newNode;
                    last = newNode;
                } else {
                    // В ином случае добавляем новый узел на position
                    newNode.next = current;
                    newNode.prev = current.prev;
                    Node<T> previousNode = current.prev;
                    previousNode.next = newNode;
                    current.prev = newNode;
                    size++;
                    return;
                }
            }
            count++;
        }
    }

    public T remove(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Нельзя удалить элемент! Индекс выходит за рамки: " + position);
        }

        int count = 0;
        Node<T> node = null;
        for (Node<T> current = first; current != null; current = current.next) {
            if (count == position) {
                if (current != null) {
                    node = current;
                    Node<T> prev = current.prev;
                    Node<T> next = current.next;

                    if (prev != null) {
                        prev.next = next;
                    } else {
                        first = next;
                    }

                    if (next != null) {
                        next.prev = prev;
                    } else {
                        last = prev;
                    }
                }
            }
            count++;
        }
        size--;
        return node.item;
    }

    public T getItemOnPos(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Индекс выходит за рамки: " + position);
        }
        int count = 0;
        T element = null;
        for (Node<T> current = first; current != null; current = current.next) {
            if (count == position) {
                element = current.item;
            }
            count++;
        }
        return element;
    }

    public int getSize() {
        return size;
    }

    public T getFirst() {
        return first != null ? first.item : null;
    }

    public T getLast() {
        return last != null ? last.item : null;
    }

    public void returnLinkedList() {
        for (Node<T> current = first; current != null; current = current.next) {
            System.out.println(current.item);
        }
    }

    protected static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        public Node(T element) {
            this.item = element;
            this.next = null;
            this.prev = null;
        }
    }
}
