package ru.tele2.govorova.java.basic.homeworks.homework26;

public class Homework26 {
    public static void main(String[] args) {


        Apple apple1 = new Apple(130);
        Apple apple2 = new Apple(150);
        Apple apple3 = new Apple(140);

        Orange orange1 = new Orange(250);
        Orange orange2 = new Orange(400);
        Orange orange3 = new Orange(290);


        Box<Apple> box1 = new Box<Apple>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<Orange>(orange1, orange3);

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<Orange>();
        box2.transfer(box3);
        Box box4 = new Box<>(apple1, orange3);
        System.out.println(box4.compare(box1));
    }


}
