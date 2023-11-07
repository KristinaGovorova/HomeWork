package ru.tele2.govorova.java.basic.homeworks.homework11;

public class Cat extends Animal {

    public Cat(String name, float speedRun, float speedSwim, float endurance, float expensesSwim) {
        super(name, speedRun, speedSwim, endurance, expensesSwim);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать!");
    }

}
