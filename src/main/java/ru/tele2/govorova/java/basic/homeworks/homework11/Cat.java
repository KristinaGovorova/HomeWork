package ru.tele2.govorova.java.basic.homeworks.homework11;

public class Cat extends Animal {

    public Cat(String name, Float speedRun, Float endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.endurance = endurance;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать!");
    }

}
