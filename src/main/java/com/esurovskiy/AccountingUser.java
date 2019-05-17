package com.esurovskiy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccountingUser {
    RandomAccessFile file;

    public AccountingUser() throws FileNotFoundException {
        file = new RandomAccessFile(
                "/home/esurovskiy/dev/users.txt", "rw");
    }

    private boolean isUserExist(String name) throws IOException {
        file.seek(0);
        String line;
        while ((line = file.readLine()) != null) {
            boolean exist = line.startsWith(name);
            if (exist) {
                return true;
            }
        }
        return false;
    }

    void testUsers(String name) {
        try {
            if (isUserExist(name)) {
                System.out.println("File pointer " + file.getFilePointer());
                file.seek(file.getFilePointer() - 5);
                final String line = file.readLine();
                String stringCounter = line.split(":")[1];
                int counter = Integer.parseInt(stringCounter);
                counter++;
                int index = line.indexOf(":");
                file.seek(file.getFilePointer() - 5 + index + 1);
                file.writeBytes(String.valueOf(counter));
            } else {
                file.writeBytes(name + ":" + "1" + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printFile() {
        try {
            String line;
            file.seek(0);
            while ((line = file.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
