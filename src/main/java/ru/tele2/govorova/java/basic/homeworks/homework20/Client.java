package ru.tele2.govorova.java.basic.homeworks.homework20;

import java.io.*;

public class Client implements AutoCloseable {
    private DataInputStream in;
    private DataOutputStream out;

    public Client(InputStream in, OutputStream out) {
        this.in = new DataInputStream(new BufferedInputStream(in));
        this.out = new DataOutputStream(new BufferedOutputStream(out));
    }

    public void ping(int userInput) throws IOException {
        out.write(userInput);
        out.flush();
    }
    public void ping2(int userInput2) throws IOException {
        out.write(userInput2);
        out.flush();
    }
    public void ping3(byte[] bytes) throws IOException {
        out.write(bytes);
        out.flush();
    }
    @Override
    public void close() throws Exception {
        in.close();
        out.close();
    }


}



