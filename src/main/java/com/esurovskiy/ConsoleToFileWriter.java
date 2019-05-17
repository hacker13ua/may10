package com.esurovskiy;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleToFileWriter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(arr));

        try (DataOutputStream os = new DataOutputStream(
                new FileOutputStream(
                        "/home/esurovskiy/dev/out3.txt",
                        true))) {
            for (String element : arr) {
                os.writeBytes(String.valueOf(element));
                os.writeBytes("\n");
            }
        }

        /*try (DataInputStream is =
                     new DataInputStream(new FileInputStream(
                             "/home/esurovskiy/dev/out3.txt"))) {
            for (int i = 0; i < 5; i++) {
                System.out.println(is.readUTF());
            }
        }*/
    }
}
