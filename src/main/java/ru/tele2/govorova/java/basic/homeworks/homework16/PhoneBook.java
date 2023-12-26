package ru.tele2.govorova.java.basic.homeworks.homework16;

import java.util.*;

public class PhoneBook {
    private static HashMap<String, String> phoneBook = new HashMap<String, String>();

    public static void printPhonebook() {
        System.out.println("Телефонный справочник: ");
        for (Map.Entry<String, String> k : phoneBook.entrySet()) {
            System.out.println(k.getValue() + ": " + k.getKey());
        }
    }


    public static void add(String fullName, String phone) {
        if (phoneBook.containsKey(phone)) {
            System.out.println("Запись с таким номером телефона уже есть");
        } else
            phoneBook.put(phone, fullName);
        System.out.println("Запись добавлена");
    }


    public static String containsPhoneNumber(String number) {
        if (phoneBook.containsKey(number)) return "Абонент с таким номером найден";
        else return "Абонент с таким номером не найден";
    }


    public static void find(String surname) {
        List<String> result = new ArrayList<String>();
        for (Map.Entry entry : phoneBook.entrySet()) {
            if (surname.equalsIgnoreCase((String) entry.getValue())) {
                result.add((String) entry.getKey());
            }
        }
        if (result.size() == 0) {
            result.add("Абонент с такой фамилией не найден");
        }

        System.out.println(surname + " " + Arrays.toString(result.toArray(new String[0])));

    }

}

