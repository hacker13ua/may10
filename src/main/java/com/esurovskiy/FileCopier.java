package com.esurovskiy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileCopier {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in =
                     new FileInputStream("/home/esurovskiy/dev/input.txt");
             FileOutputStream out
                     = new FileOutputStream("/home/esurovskiy/dev/output.txt")) {
            byte[] inputArray = new byte[4];
            int c = in.read(inputArray);
            while (c != -1) {
                System.out.println(Arrays.toString(inputArray));
                out.write(inputArray, 0, c);
                c = in.read(inputArray);
            }
        }
    }
}
