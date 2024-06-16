package ru.tele2.govorova.java.basic.homeworks.homework20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Set;

public class Server {

    public static final Set<String> Operations = Set.of("+", "-", "*", "/");

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        while (true) {
            Socket client = serverSocket.accept();
            System.out.println("Client connected");
            DataOutputStream outPut = new DataOutputStream( new BufferedOutputStream(client.getOutputStream()));
            outPut.writeUTF(Operations.toString());
            outPut.flush();
            doOperation(client);
        }
    }

    private static void doOperation(Socket client) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        int firstNumber = in.read();
        int secondNumber = in.read();
        String operation = in.readLine();
        double result;
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (operation.equals("/")) {
            result = (double) firstNumber / secondNumber;
        } else {
            result = 404;
        }
        out.writeDouble(result);
        out.flush();
    }
}


