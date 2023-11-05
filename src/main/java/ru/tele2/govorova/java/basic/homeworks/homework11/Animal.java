package ru.tele2.govorova.java.basic.homeworks.homework11;

public abstract class Animal {
    protected String name;
    protected Float speedRun;
    protected Float endurance;

    public void info() {
        System.out.println("Имя животного: " + name + "\nВыносливость: " + endurance);
    }

    public void run(int distance) {
        if (distance <= endurance) {
            System.out.println("Время, затраченное на " + distance + " метров = " + (distance / speedRun) + " сек." + "\nВыносливость при этом станет: " + (endurance - distance) + " ед.");
            endurance -= distance;
        } else {
            System.out.println("Время, затраченное на " + distance + " метров = -1" + "\nУ животного (" + name + ") появилось состояние усталости");

        }

    }

    public abstract void swim(int distance);

}
