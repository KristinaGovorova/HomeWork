package ru.tele2.govorova.java.basic.homeworks.homework17;

public class MainApplication {

    public static void main(String[] args) {

        System.out.println("Тестируем MyLinkedList");
        MyLinkedList<String> myLinkedList = new MyLinkedList();
        myLinkedList.addLast("Добавляет");
        myLinkedList.addLast("элемент");
        myLinkedList.addLast("в");
        myLinkedList.addLast("конец");
        myLinkedList.addLast("списка");

        myLinkedList.returnLinkedList();
        System.out.println(myLinkedList.getSize());
        System.out.println();

        System.out.println("Элемент на позиции 0: " + myLinkedList.getItemOnPos(0));
        System.out.println();

        myLinkedList.addFirst("списка в начало");
        myLinkedList.addFirst("элемент");

        myLinkedList.returnLinkedList();
        System.out.println(myLinkedList.getSize());
        System.out.println();

        System.out.println("Первый элемент списка: " + myLinkedList.getFirst());
        System.out.println("Последний элемент списка: " + myLinkedList.getLast());
        System.out.println();

        myLinkedList.getItemOnPos(0);
        System.out.println();

        myLinkedList.add(4, "##############################");
        myLinkedList.returnLinkedList();
        System.out.println(myLinkedList.getSize());
        System.out.println();

        System.out.println("Элемент на позиции 8: " + myLinkedList.getItemOnPos(8));
        System.out.println();

        System.out.println("Удаляем из списка элемент: " + myLinkedList.remove(4));
        System.out.println();
        myLinkedList.returnLinkedList();
        System.out.println(myLinkedList.getSize());
        System.out.println();


        System.out.println("Добавляем элементы в стек");
        MyStack<String> myStack = new MyStack<>();
        myStack.pushStack("Первый");
        myStack.pushStack("Второй");
        myStack.pushStack("Третий");
        myStack.pushStack("Четвертый");
        myStack.pushStack("Пятый");

        myStack.returnLinkedList();
        System.out.println();
        System.out.println("Удалил из стека: " + myStack.popStackElement());
        System.out.println();
        myStack.returnLinkedList();
        System.out.println("Удалил из стека: " + myStack.popStackElement());
        System.out.println();
        myStack.returnLinkedList();
        System.out.println("Удалил из стека: " + myStack.popStackElement());
        System.out.println();
        myStack.returnLinkedList();
        System.out.println("Удалил из стека: " + myStack.popStackElement());
        System.out.println();
        myStack.returnLinkedList();
        System.out.println("Удалил из стека: " + myStack.popStackElement());
        System.out.println();
        myStack.returnLinkedList();


        System.out.println("Добавляем элементы в очередь");
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.addElement(1);
        myQueue.addElement(2);
        myQueue.addElement(3);
        myQueue.addElement(4);
        myQueue.addElement(5);

        myQueue.returnLinkedList();
        System.out.println();
        System.out.println("Забрал из очереди элемент: " + myQueue.takeElement());
        myQueue.returnLinkedList();
        System.out.println();

        System.out.println("Забрал из очереди элемент: " + myQueue.takeElement());
        myQueue.returnLinkedList();
        System.out.println();

        System.out.println("Забрал из очереди элемент: " + myQueue.takeElement());
        myQueue.returnLinkedList();
        System.out.println();

        System.out.println("Забрал из очереди элемент: " + myQueue.takeElement());
        myQueue.returnLinkedList();
        System.out.println();

        System.out.println("Забрал из очереди элемент: " + myQueue.takeElement());
        myQueue.returnLinkedList();
        System.out.println();

    }
}
