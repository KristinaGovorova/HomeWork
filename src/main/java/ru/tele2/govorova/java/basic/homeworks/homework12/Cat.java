package ru.tele2.govorova.java.basic.homeworks.homework12;

import java.sql.SQLOutput;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }

    public void eat(Plate plate) {
        if (full == false && appetite <= plate.getFood()) {

            plate.decreaseFood(appetite);
            full = true;
            System.out.println("В тарелке осталось " + plate.getFood() + "\n" + name + " поел\n");
            return;
        }
        if (full == false && appetite > plate.getFood()) {
            System.out.println("В тарелке недостаточно еды" + "\n" + name + " остался голоден\n");
            return;
        }
        System.out.println("Кот не голоден\n");

    }


}
