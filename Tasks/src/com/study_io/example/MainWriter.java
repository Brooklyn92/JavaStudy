package com.study_io.example;

import java.io.FileWriter;
import java.io.Writer;

public class MainWriter {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("output2.txt");
            writer.write("Hello");
            writer.close();
        } catch (Exception e) {
            System.out.println("Что-то не так - " + e.getMessage());
        }
    }
}
