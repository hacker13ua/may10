package com.esurovskiy;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class UserDataBase {
    public static void main(String[] args) throws FileNotFoundException {
        AccountingUser au = new AccountingUser();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String userName = sc.nextLine();
            au.testUsers(userName);
        }
        au.printFile();
        au.close();
    }
}
