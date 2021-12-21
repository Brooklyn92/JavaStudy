package com.study_io.example;

import java.io.FileReader;
import java.io.Reader;

public class MainReader {
    public static void main(String[] args) {
        try {
            Reader reader  = new FileReader("input.txt");
            int currentCharacter = reader.read();

            while (currentCharacter != -1){
                System.out.print((char)currentCharacter);
                currentCharacter = reader.read();
            }
        } catch (Exception e){
            System.err.println("Что-то пошло не так");
        }

    }
}
