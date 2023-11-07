package ru.tele2.govorova.java.basic.homeworks.homework11;

public class Animal {
    protected String name;
    protected float speedRun;
    protected float endurance;
    protected float expensesSwim;
    protected float speedSwim;


    public Animal(String name, float speedRun, float speedSwim, float endurance, float expensesSwim) {
        this.name = name;
        this.speedRun = speedRun;
        this.endurance = endurance;
        this.expensesSwim = expensesSwim;
        this.speedSwim = speedSwim;
    }

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

    public void swim(int distance) {
        if (distance * expensesSwim <= endurance) {
            System.out.println("Время, затраченное на " + distance + " метров = " + (distance / speedSwim) + " сек." + "\nВыносливость при этом станет: " + (endurance - distance * expensesSwim) + " ед.");
            endurance -= distance * expensesSwim;
        } else {
            System.out.println("Время, затраченное на " + distance + " метров = -1" + "\nУ животного появилось состояние усталости");

        }
    }
}
