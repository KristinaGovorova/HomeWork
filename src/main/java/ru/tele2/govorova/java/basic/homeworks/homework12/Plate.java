package ru.tele2.govorova.java.basic.homeworks.homework12;

public class Plate {
    private int food;
    private int foodMax;

    public Plate(int food, int foodMax) {
        this.food = food;
        this.foodMax = foodMax;
    }

    public int getFood() {
        return food;
    }


    public void additionFood(int add) {
        if (food == foodMax) {
            System.out.println("Тарелка уже полна");
            return;
        }
        if ((food += add) <= foodMax) {
            System.out.println("Сейчас в тарелке " + food);
            return;
        }
        food = foodMax;
        System.out.println("Сейчас в тарелке " + food);
    }

    public void decreaseFood(int dec) {
        food -= dec;

        if (food >= 0) {
            System.out.println(true);

        } else {
            food = 0;
            System.out.println(false);
        }
    }
}
