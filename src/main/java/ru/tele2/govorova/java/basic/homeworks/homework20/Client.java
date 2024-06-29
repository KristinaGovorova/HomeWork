package ru.tele2.govorova.java.basic.homeworks.homework20;

import java.io.*;
import java.net.Socket;

public class Client implements AutoCloseable {

    private DataInputStream in;
    private DataOutputStream out;

    public Client(Socket socket) throws IOException {
        this.in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        this.out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    }

    public void send(int firstNumber, int secondNumber, String operation) throws IOException {
        out.write(firstNumber);
        out.write(secondNumber);
        out.write(operation.getBytes());
        out.flush();
    }

    public Double readResult() throws IOException {
        return in.readDouble();
    }

    public String readLine() throws IOException {
        return in.readUTF();
    }

    @Override
    public void close() throws Exception {
        in.close();
        out.close();
    }


}



