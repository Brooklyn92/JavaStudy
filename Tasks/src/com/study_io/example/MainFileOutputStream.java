package com.study_io.example;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainFileOutputStream {
    public static void main(String[] args) {
        String str1 = "Hello Arcane";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("C:/testFile/Arcane.txt", true);
           byte[] buff = str1.getBytes();
           fileOutputStream.write(buff);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
