package ru.tele2.govorova.java.basic.homeworks.homework17;


public class Homework17 {
    public static void main(String[] args) {
        PersonDataBase db = new PersonDataBase();
        db.add(new Person("Светлана", Position.MANAGER));
        db.add(new Person("Олег", Position.DIRECTOR));
        db.add(new Person("Дмитрий", Position.DRIVER));
        db.add(new Person("Алексей", Position.ENGINEER));
        db.add(new Person("Иван", Position.SENIOR_MANAGER));
        db.add(new Person("Михаил", Position.DEVELOPER));
        db.add(new Person("Петр", Position.QA));
        db.add(new Person("Евгений", Position.JANITOR));
        db.add(new Person("Емеля", Position.PLUMBER));
        db.add(new Person("Владимир", Position.BRANCH_DIRECTOR));
        Person person1 = new Person("Марина", Position.JUNIOR_DEVELOPER);
        db.add(person1);
        Person person2 = new Person("Юрий", Position.MANAGER);
        db.add(person2);

        System.out.println(db.findById(4L));
        System.out.println(db.isEmployee(5L));
        System.out.println(db.isManager(person1));
        System.out.println(db.isManager(person2));

        int[] arrayToSort = {1, -3, 45, 67, -99, 0, 33};
        ArraySorting.bubbleSort(arrayToSort);
        int low = 0;
        int high = arrayToSort.length - 1;
        ArraySorting.quickSort(arrayToSort,low, high);

    }
}
