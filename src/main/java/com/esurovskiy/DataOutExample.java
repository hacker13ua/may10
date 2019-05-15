package com.esurovskiy;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutExample {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream os =
                     new DataOutputStream(
                             new FileOutputStream(
                                     "/home/esurovskiy/dev/out2.txt"))) {
            os.writeBoolean(true);
            os.writeBoolean(false);
            os.writeDouble(12.23);
            os.writeFloat(12.23f);
            os.writeInt(10);
            os.writeLong(11);
            os.writeBytes("qwerty");
            os.writeChars("qwerty");
            os.writeUTF("qwerty");
        }
    }
}
