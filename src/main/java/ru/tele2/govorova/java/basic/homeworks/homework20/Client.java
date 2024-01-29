package ru.tele2.govorova.java.basic.homeworks.homework20;

import java.io.*;

public class Client implements AutoCloseable {
        private DataInputStream in;
        private DataOutputStream out;

    public Client(InputStream in, OutputStream out) {
            this.in = new DataInputStream(new BufferedInputStream(in));
            this.out = new DataOutputStream(new BufferedOutputStream(out));
        }

        public void ping(byte[] bytes) throws IOException {
            out.write(bytes);
            out.flush();
        }

        @Override
        public void close() throws Exception {
            in.close();
            out.close();
        }
    }


