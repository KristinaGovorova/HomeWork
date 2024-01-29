package ru.tele2.govorova.java.basic.homeworks.homework20;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Homework20 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        byte[] bytes = userInput.getBytes();
        System.out.println("Введите второе число");
        String userInput2 = scanner.nextLine();
        byte[] bytes2 = userInput2.getBytes();
        System.out.println("Выберите одну из доступных мат. операций: +,-,*,/");
        String userInput3 = scanner.nextLine();
        byte[] bytes3 = userInput3.getBytes();
        try(Socket socket = new Socket("localhost", 8080)) {
           Client pingClient = new Client(socket.getInputStream(), socket.getOutputStream());
            pingClient.ping(bytes);
            pingClient.ping(bytes2);
            pingClient.ping(bytes3);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
