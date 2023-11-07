package ru.tele2.govorova.java.basic.homeworks.homework11;

public class Homework11 {
    public static void main(String[] args) {
        Cat Cat1 = new Cat("Мурзик", 5f, -1f, 20f, -1f);
        Dog Dog1 = new Dog("Тузик", 8f, 6f, 20f, 2f);
        Horse Horse1 = new Horse("Ветерок", 8f, 2f, 20f, 4f);


        Cat1.info();
        Cat1.run(19);
        Cat1.swim(10);
        Cat1.info();
        Dog1.info();
        Dog1.swim(5);
        Dog1.info();
        Horse1.info();
        Horse1.swim(6);
        Horse1.info();
    }
}