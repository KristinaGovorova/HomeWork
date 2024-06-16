package ru.tele2.govorova.java.basic.homeworks.homework19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class Homework19 {

    public static void main(String[] args) throws IOException {

        String path = Paths.get("").toAbsolutePath() + "/src/main/java/ru/tele2/govorova/java/basic/homeworks/homework19";
        File dir = new File(path);

        if (dir.isDirectory())
            System.out.println("Список файлов в директории: \n");
        for (File item : dir.listFiles()) {
            if (item.isFile()) {
                System.out.println(item.getName() + "\t");
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла, с которым хотите работать");
        String fileName = scanner.next();
        File file = new File(path, fileName);
        boolean result = file.createNewFile();
        if (!result)
        {
            try (InputStreamReader in = new InputStreamReader(new FileInputStream(path + "/" + fileName))) {
                int n = in.read();
                while (n != -1) {
                    System.out.print((char) n);
                    n = in.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }}
        else
        {System.out.println("Создан файл " + fileName);}


        System.out.println("Введите текст");
        String data = scanner.next();

        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path + "/" + fileName, true))) {
            byte[] buffer = (data + "\n").getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
