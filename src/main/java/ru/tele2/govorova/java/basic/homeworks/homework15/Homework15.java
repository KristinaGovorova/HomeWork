package ru.tele2.govorova.java.basic.homeworks.homework15;

import java.util.ArrayList;
import java.util.List;

import static ru.tele2.govorova.java.basic.homeworks.homework15.Employee.returnEmployeeNameFromList;
import static ru.tele2.govorova.java.basic.homeworks.homework15.Employee.returnEmployeeOlderOrExactAge;

public class Homework15 {
    public static void main(String[] args) {
//        minMax(5, 30);
//        sumOfMore5(new ArrayList<>(List.of(1, 5, 6, 3, 7)));
//        notAnArray(new ArrayList<>(List.of(1, 5, 6, 3, 7)), 10);
//        summarizeValues(new ArrayList<>(List.of(1, 5, 6, 3, 7)), 10);
        ArrayList<Employee> uselessPeople = new ArrayList<Employee>();
        uselessPeople.add(new Employee("Sergey", 24));
        uselessPeople.add(new Employee("Michail", 42));
        uselessPeople.add(new Employee("Evgeniy", 33));
        uselessPeople.add(new Employee("Olga", 33));
        uselessPeople.add(new Employee("Tatiana", 25));
        returnEmployeeNameFromList(uselessPeople);
        returnEmployeeOlderOrExactAge(uselessPeople, 25);
    }


    public static void minMax(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        int lenght = max - min + 1;
        for (int i = 0; i < lenght; i++) {
            list.add(min);
            min += 1;
        }
        System.out.println(list);
    }

    public static void sumOfMore5(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer s : list) {
            if (s > 5) {
                sum += s;
            }

        }
        System.out.println(sum);
    }

    public static void notAnArray(ArrayList<Integer> list, int b) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, b);
        }
        System.out.println(list);
    }

    public static void summarizeValues(ArrayList<Integer> list, int b) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, (list.get(i) + b));
        }
        System.out.println(list);
    }



}

