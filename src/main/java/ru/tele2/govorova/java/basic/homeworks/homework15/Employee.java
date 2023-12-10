package ru.tele2.govorova.java.basic.homeworks.homework15;

import java.util.*;

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

    public static ArrayList<String> returnEmployeeNameFromList(ArrayList<Employee> list) {
        ArrayList<String> namesArray = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            namesArray.add(list.get(i).getName());
        }
        System.out.println(namesArray);
        return namesArray;
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
        int b = 0;
        b = age % list.size();
        if (age > averageAge || (age == averageAge && b > 0)) {
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

    public static void getYoungerEmployee(ArrayList<Employee> list) {
        Collections.sort(list, new Comparator<Employee>() {

            @Override
            public int compare(Employee t, Employee t1) {
                return t.getAge() - t1.getAge();
            }
        });
        System.out.println(list.get(0));
    }

    @Override
    public String toString() {
        return (name + " " + age + " ");
    }

}
