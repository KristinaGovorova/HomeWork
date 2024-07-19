package ru.tele2.govorova.java.basic.homeworks.homework27;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Homework27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла, с которым хотите работать");
        String fileName = scanner.next();
        System.out.println("Введите искомую последовательность символов");
        String toSearch = scanner.next();

        File file = new File(fileName);
        if (!(file.exists())) {
            System.out.println("Данного файла не существует");
        } else {
            System.out.println("Последовательность " + toSearch + " повторяется " + countRepetitionsSequence(fileName, toSearch) + " раз(а)");
        }
    }

    public static int countRepetitionsSequence(String fileName, String toSearch) {
        int count = 0;

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName))) {
            byte[] bytes = bufferedInputStream.readAllBytes();
            String data = new String(bytes, StandardCharsets.UTF_8);
            int indexOfSearch = data.indexOf(toSearch);
            while (indexOfSearch != -1) {
                count += 1;
                indexOfSearch = data.indexOf(toSearch, indexOfSearch + toSearch.length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}



