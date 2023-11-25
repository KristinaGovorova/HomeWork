package ru.tele2.govorova.java.basic.homeworks.homework12;

public class Homework12 {
    public static void main(String[] args) {
        Cat Cat1 = new Cat("Барсик", 10, false);
        Cat Cat2 = new Cat("Снежок", 80, false);
        Plate Plate1 = new Plate(100);
        Cat[] Cats = {
                new Cat("Мурзик", 13, false),
                new Cat("Кокос", 19, false),
                new Cat("Бася", 26, false),
                new Cat("Бегомот", 3, false),
                new Cat("Маркиз", 13, false),
                new Cat("Пушистик", 19, false),
                new Cat("Гарфилд", 26, false),
                new Cat("Том", 3, false),
                new Cat("Черныш", 4, false),
                new Cat("Беляш", 3, false)
        };

        Plate1.decreaseFood(101);

        Plate1.additionFood(90);

        Cat1.eat(Plate1);
        Cat2.eat(Plate1);

        Plate1.additionFood(100);

        for (int i = 0; i < Cats.length; i++) {
            if (Plate1.getFood() == 0) {
                System.out.println("Тарелка пустая");
                return;
            }
            Cats[i].eat(Plate1);
        }
    }
}