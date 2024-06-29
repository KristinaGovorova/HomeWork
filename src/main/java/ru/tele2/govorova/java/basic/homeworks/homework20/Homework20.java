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



        try(Socket socket = new Socket("localhost", 9000)) {
            Client client = new Client(socket);

            String operations = client.readLine();
            System.out.println("Выберите одну из доступных мат. операций: " + operations);
            Scanner scanner2 = new Scanner(System.in);

            String userInput3 = scanner2.nextLine();
            client.send(userInput, userInput2, userInput3 + "\n");

            double result = client.readResult();
            System.out.println(result);

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

