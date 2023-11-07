package ru.tele2.govorova.java.basic.homeworks.homework10;

public class Box {
    private String color; //цвет
    final String size; // размер
    private boolean open; //Открыта.закрыта
    private String item; //предмет


    public Box(String color, String size, Boolean open, String item) {
        this.color = color;
        this.size = size;
        this.open = open;
        this.item = item;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public boolean isOpen() {
        return open;
    }

    public String getItem() {
        return item;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String toString() {
        return String.format("Цвет: %s \nРазмер: %s \nОткрытость: %s  \nПредмет: %s",
                color, size, open, item);
    }

    public void changeColor(String newColor) {

        this.color = newColor;
        System.out.println("Вы изменили цвет коробки");

    }

    public void close() {


        if (open) {
            this.open = false;
            System.out.println("Вы закрыли коробку!");
        } else {
            System.out.println("Вы пытаетесь закрыть закрытую коробку!");
        }
    }

    public void open() {


        if (!open) {
            this.open = true;
            System.out.println("Вы открыли коробку!");
        } else {
            System.out.println("Вы пытаетесь открыть открытую коробку!");
        }
    }

    public void itemOut() {

        if (getItem() != null && open) {
            this.item = null;
            System.out.println("Вы очистили коробку!");

        } else if (this.item == null || this.item != null && !open) {
            System.out.println("Вы патаетесь очистить закрытую коробку!");
        } else {
            System.out.println("Вы пытаетесь положить предмет в заполненную коробку!");
        }
    }

    public void itemIn(String answer) {
        if (this.item == null && open) {
            this.item = answer;
            System.out.println("Вы положили в коробку следующий предмет: " + answer);
        } else if (this.item == null && !open) {
            System.out.println("Вы патаетесь положить предмет в закрытую коробку!");
        } else if (this.item != null && !open) {
            System.out.println("Вы патаетесь положить предмет в закрытую непустую коробку!");
        } else {
            System.out.println("Вы пытаетесь положить предмет в заполненную коробку!");
        }
    }

}
