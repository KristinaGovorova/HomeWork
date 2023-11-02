package ru.tele2.govorova.java.basic.homeworks.homework10;


public class Homework10 {
    public static void main(String[] args) {

        User User1 = new User("Говорова", "Кристина", "Владимировна", "test@mail.ru", 1994);
        User User2 = new User("Петров", "Петр", "Петрович", "test1@mail.ru", 1964);
        User User3 = new User("Сидоров", "Сидор", "Сидорович", "test2@mail.ru", 1999);


        User1.info();
        User2.info();
        User3.info();


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Возраст больше 40:");

        User[] array = new User[10];
        array[0] = new User("Говорова", "Кристина", "Владимировна", "test@mail.ru", 1994);
        array[1] = new User("Петров", "Петр", "Петрович", "test1@mail.ru", 1964);
        array[2] = new User("Сидоров", "Сидор", "Сидорович", "test2@mail.ru", 1999);
        array[3] = new User("Иванов", "Иван", "Иванович", "test3@mail.ru", 2003);
        array[4] = new User("Галустян", "Михаил", "Попович", "test4@mail.ru", 2001);
        array[5] = new User("Капустин", "Владислав", "Юрьевич", "test5@mail.ru", 1967);
        array[6] = new User("Дмитриев", "Олег", "Петрович", "test6@mail.ru", 1984);
        array[7] = new User("Вахненко", "Владимир", "Владимирович", "test7@mail.ru", 1975);
        array[8] = new User("Шиханов", "Александр", "Денисович", "test8@mail.ru", 1971);
        array[9] = new User("Химич", "Наталья", "Владимировна", "test9@mail.ru", 1970);

        int currentYear = 2023;
        for (int i = 0; i < array.length; i++)
            if (currentYear - array[i].getYearOfBirth() > 40) {
                array[i].info();
            }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Задание с коробкой");
        Box Box1 = new Box("Черный", "10/10/30", Boolean.TRUE, "Книга");
        Box Box2 = new Box("Красный", "10/10/40", Boolean.FALSE, "Кружки");
        Box Box3 = new Box("Красный", "10/10/40", Boolean.TRUE, null);

        System.out.println(Box1);
        System.out.println();
        System.out.println();

        Box1.setColor("Розовый");
        System.out.println("Мы поменяли цвет коробки: \n\n" + Box1);

        System.out.println();
        System.out.println();

        Box1.changeColor();
        System.out.println(Box1);

        System.out.println();
        System.out.println();

        Box1.close();
        System.out.println(Box1);

        System.out.println();
        System.out.println();

        Box1.item();
        System.out.println(Box1);

        System.out.println();
        System.out.println();

        Box1.item();
        System.out.println(Box1);

        System.out.println();
        System.out.println();

        Box1.item2(null);
        System.out.println(Box1);
    }
}







