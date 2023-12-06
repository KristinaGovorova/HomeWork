package ru.tele2.govorova.java.basic.homeworks.homework15;

import java.util.ArrayList;
import java.util.Arrays;

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
            if (list.get(i).getAge() >= minimalAge){
                orderedList.add(list.get(i));
            }
        }
        System.out.println(Arrays.asList(orderedList));
    }

    @Override
    public String toString() {
        return(name + " " + age + " ");
    }

}
