package com.study_io.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainFileInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:/testFile/Arcane.txt");
            int cur = fileInputStream.read();
           while (cur !=-1){
               System.out.print((char)cur + "");
               cur = fileInputStream.read();

           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
