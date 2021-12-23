package com.study_io.study_file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOne {
    public static void main(String[] args) {
        File f2 = new File("/testFile","6.txt");
        FileWriter fileWriter = null; // значение по умолчанию null
        String str = "Arcane"; // вписываем строку в файл 2.txt
        try {
            fileWriter = new FileWriter(f2,true);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(f2.renameTo(new File("/testFile","23.txt"))); // переименование созданного файла.
    }
}

