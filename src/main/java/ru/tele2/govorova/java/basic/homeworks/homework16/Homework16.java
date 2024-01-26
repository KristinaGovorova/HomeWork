package ru.tele2.govorova.java.basic.homeworks.homework16;


import static ru.tele2.govorova.java.basic.homeworks.homework16.PhoneBook.containsPhoneNumber;
import static ru.tele2.govorova.java.basic.homeworks.homework16.PhoneBook.find;

public class Homework16 {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();

        phonebook.add("Карпов Юрий Сергеевич", "71111111111");
        phonebook.add("Карпов Юрий Сергеевич", "71111111111");
        phonebook.add("Карпов Юрий Сергеевич", "72222222222");
        phonebook.add("Поляков Артем Евгеньевич", "73333333333");
        phonebook.add("Антонов Михаил Павлович", "74444444444");
        phonebook.add("Поляков Артем Евгеньевич", "75555555555");
        phonebook.add("Поляков Артем Евгеньевич", "76666666666");
        phonebook.add("Карпов Юрий Сергеевич", "77777777777");
        phonebook.add("Антонов Михаил Павлович", "78888888888");
        phonebook.add("Карпов Юрий Сергеевич", "79999999999");


        System.out.println(containsPhoneNumber("78888888888"));
        System.out.println(containsPhoneNumber("79879879988"));


        find("Карпов Юрий Сергеевич");
        find("Антонов Михаил Павлович");
        find("Поляков Артем Евгеньевич");
        find("Гапоненко Радомир Иванович");


        phonebook.printPhonebook();

    }
}
