package ru.tele2.govorova.java.basic.homeworks.homework27;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Homework27 {
    public static void main(String[] args) {
        String fileName;
        String toSearch;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите название файла, с которым хотите работать");
            fileName = scanner.next();
            System.out.println("Введите искомую последовательность символов");
            toSearch = scanner.next();
        } finally {
            scanner.close();
        }
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Данного файла не существует");
            return;
        }

        System.out.println("Последовательность " + toSearch + " повторяется " + countRepetitionsSequence(new File(fileName), toSearch) + " раз(а)");

    }

    public static int countRepetitionsSequence(File file, String toSearch) {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int indexOfSearch = line.indexOf(toSearch);
                while (indexOfSearch != -1) {
                    count += 1;
                    indexOfSearch = line.indexOf(toSearch, indexOfSearch + toSearch.length());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}




