package com.esurovskiy;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) throws IOException {
        /*File usersFile = new File("/home/esurovskiy/dev/");
        System.out.println(usersFile.exists());
        System.out.println(usersFile.getTotalSpace());*/
        final Scanner sc = new Scanner(System.in);
        while (true){
            final String line = sc.nextLine();
            if("exit".equals(line)){
                break;
            }
        }
    }
}
