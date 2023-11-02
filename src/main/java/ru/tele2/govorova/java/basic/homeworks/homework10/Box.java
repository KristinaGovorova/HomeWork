package ru.tele2.govorova.java.basic.homeworks.homework10;


import java.util.Scanner;

public class Box {
    private String color; //цвет
    private String size; // размер
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

    public boolean isStatus() {
        return open;
    }

    public String getItem() {
        return item;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStatus(boolean open) {
        this.open = open;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String toString() {
        return String.format("Цвет: %s \nРазмер: %s \nОткрытость: %s  \nПредмет: %s",
                color, size, open, item);
    }

    public void changeColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите перекрасить коробку? \nВведите 'Да' или 'Нет'");
        String answer = scanner.next();

        if (answer.equals("Да")) {
            System.out.println("Введите цвет");
            String newColor = scanner.next();
            this.color = newColor;
            System.out.println("Вы изменили цвет коробки");
        } else {
            System.out.println("Вы решили не перекрашивать коробку");
        }
    }

    public void close() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Хотите открыть или закрыть коробку? \nВведите '1', если ходите открыть коробку, и '0' - закрыть");
        int cmd = scanner.nextInt();

        if (cmd == 1) {
            if (!isStatus()) {
                this.open = Boolean.TRUE;
            } else {
                System.out.println("Вы пытаетесь открыть открытую коробку!");
            }
        } else {
            if (isStatus()) {
                this.open = Boolean.FALSE;
            } else {
                System.out.println("Вы пытаетесь закрыть закрытую коробку!");
            }
        }
    }


    public void item() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите положить предмет в коробку или выкинуть его? \nВведите '1', если положить, и '0' - выкинуть");
        int cmd = scanner.nextInt();

        if (cmd == 1) {
            if (getItem() == null && isStatus()) {
                System.out.println("какой предмет вы хотите положить в коробку?");
                String answer = scanner.next();
                this.item = answer;
            } else if (getItem() == null && !isStatus()) {
                System.out.println("Вы патаетесь положить предмет в закрытую коробку!");
            } else if (getItem() != null && !isStatus()) {
                System.out.println("Вы патаетесь положить предмет в закрытую непустую коробку!");
            } else {
                System.out.println("Вы пытаетесь положить предмет в заполненную коробку!");
            }
        } else {
            if (getItem() != null && isStatus()) {
                this.item = null;
                System.out.println("Вы очистили коробку!");
            } else if (getItem() == null || getItem() != null && !isStatus()) {
                System.out.println("Вы патаетесь очистить закрытую коробку!");
            } else {
                System.out.println("Вы пытаетесь положить предмет в заполненную коробку!");
            }
        }
    }


    //Без ввода с клавиатуры
    public void item2(String answer) {
        if (answer != null) {
            if (getItem() == null && isStatus()) {

                this.item = item;
                ;
            } else if (getItem() == null && !isStatus()) {
                System.out.println("Вы патаетесь положить предмет в закрытую коробку!");
            } else if (getItem() != null && !isStatus()) {
                System.out.println("Вы патаетесь положить предмет в закрытую непустую коробку!");
            } else {
                System.out.println("Вы пытаетесь положить предмет в заполненную коробку!");
            }
        } else {
            if (getItem() != null && isStatus()) {
                setItem(null);
                System.out.println("Вы очистили коробку!");

            } else if (getItem() == null || getItem() != null && !isStatus()) {
                System.out.println("Вы патаетесь очистить закрытую коробку!");
            } else {
                System.out.println("Вы пытаетесь положить предмет в заполненную коробку!");
            }
        }
    }
}




