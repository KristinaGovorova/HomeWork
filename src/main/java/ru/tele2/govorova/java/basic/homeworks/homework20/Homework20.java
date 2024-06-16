package ru.tele2.govorova.java.basic.homeworks.homework20;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Homework20 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();


        System.out.println("Введите второе число");
        int userInput2 = scanner.nextInt();

        System.out.println("Выберите одну из доступных мат. операций: +,-,*,/");
        Scanner scanner2 = new Scanner(System.in);
        String userInput3 = scanner2.nextLine();
        byte[] bytes = userInput3.getBytes();

        try(Socket socket = new Socket("localhost", 8081)) {
            Client pingClient = new Client(socket.getInputStream(), socket.getOutputStream());
            pingClient.ping(userInput);
            pingClient.ping2(userInput2);
            pingClient.ping3(bytes);


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

