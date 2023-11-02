package ru.tele2.govorova.java.basic.homeworks.homework10;

public class User {


    private String name; //Имя
    private String surname; // Отчество
    private String lastName; //Фамилия
    private String email; //емейл
    private int yearOfBirth; //год рождения

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


    public User(String lastName, String name, String surname, String email, int yearOfBirth) {
        this.lastName = lastName;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.yearOfBirth = yearOfBirth;

    }

    public void info() {
        System.out.println("ФИО: " + lastName + ' ' + name + ' ' + surname + "\nГод рождения: " + yearOfBirth + "\ne-mail: " + email);
    }

}





