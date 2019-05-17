package com.esurovskiy;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputExample {
    public static void main(String[] args) throws IOException {
        try (DataInputStream is = new DataInputStream(
                new FileInputStream(
                        "/home/esurovskiy/dev/out2.txt"))) {
            System.out.println("b = " + is.readBoolean());
            System.out.println("b = " + is.readBoolean());
            System.out.println("d = " + is.readDouble());
            System.out.println("f = " + is.readFloat());
            System.out.println("i = " + is.readInt());
            System.out.println("l = " + is.readLong());

            byte[] stringAsBytes = new byte[6];
            for (int i = 0; i < 6; i++) {
                stringAsBytes[i] = is.readByte();
            }
            System.out.println(new String(stringAsBytes));

            char[] stringAsChars = new char[6];
            for (int i = 0; i < 6; i++) {
                stringAsChars[i] = is.readChar();
            }
            System.out.println(new String(stringAsChars));
            System.out.println(is.readUTF());
            System.out.println(is.read());
        }
    }
}
