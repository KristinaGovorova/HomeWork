package ru.tele2.govorova.java.basic.homeworks.homework15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Employee {

    private String name; //Имя
    private int age; //возраст

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void returnEmployeeNameFromList(ArrayList<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }

    public static void returnEmployeeOlderOrExactAge(ArrayList<Employee> list, int minimalAge) {
        ArrayList<Employee> orderedList = new ArrayList<Employee>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAge() >= minimalAge) {
                orderedList.add(list.get(i));
            }
        }
        System.out.println(Arrays.asList(orderedList));
    }

    public static void returnEmployeeOlderOrExactAge2(ArrayList<Employee> list, int minimalAge) {
        Iterator<Employee> iter = list.iterator();
        while (iter.hasNext()) {
            Employee s = iter.next();
            if (s.getAge() < minimalAge) {
                iter.remove();
            }
        }
        System.out.println(Arrays.asList(list));
    }


    public static boolean averageAge(ArrayList<Employee> list, int averageAge) {
        int age = 0;
        for (int i = 0; i < list.size(); i++) {
            age += list.get(i).getAge();
        }
        age = age / list.size();
        if (age > averageAge) {
            System.out.println("Средний возраст " + age + ", т.е. больше минимального");
            return true;
        }
        System.out.println("Средний возраст " + age + ", т.е. меньше минимального");
        return false;
    }

    public static void younger(ArrayList<Employee> list) {
        Iterator<Employee> iter = list.iterator();
        int minAge = 200;
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getAge() < minAge) {
                minAge = list.get(i).getAge();
            }

        while (iter.hasNext()) {
            Employee s = iter.next();
            if (s.getAge() != minAge) {
                iter.remove();
            }
        }
        System.out.println(Arrays.asList(list));
    }

    @Override
    public String toString() {
        return (name + " " + age + " ");
    }

}
