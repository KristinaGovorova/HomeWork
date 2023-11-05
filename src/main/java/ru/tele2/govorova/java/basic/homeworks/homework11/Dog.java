package ru.tele2.govorova.java.basic.homeworks.homework11;

public class Dog extends Animal {
    private Float expensesswim;
    private Float speedSwim;


    public Dog(String name, Float speedRun, Float speedSwim, Float endurance, Float expensesswim) {
        this.name = name;
        this.speedRun = speedRun;
        this.endurance = endurance;
        this.expensesswim = expensesswim;
        this.speedSwim = speedSwim;
    }

    @Override
    public void swim(int distance) {
        if (distance * expensesswim <= endurance) {
            System.out.println("Время, затраченное на " + distance + " метров = " + (distance / speedSwim) + " сек." + "\nВыносливость при этом станет: " + (endurance - distance * expensesswim) + " ед.");
            endurance -= distance * expensesswim;
        } else {
            System.out.println("Время, затраченное на " + distance + " метров = -1" + "\nУ собаки появилось состояние усталости");

        }
    }
}
