package com.study_io.follow_the_white_rabbit_youtube_learning;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /* =================================Чтение файла============================
        int b = 0;
        InputStreamReader inputStreamReader = null;
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("F:/1.txt"); //FileInputStream - байтовый поток
            inputStreamReader = new InputStreamReader(inputStream, "UTF-8"); //InputStreamReader - cтроковый поток
            while ((b=inputStreamReader.read()) != -1) { //помещаем в while что бы прочитался весь файл. Т.к. по умолчанию читается всего 1 байт файла.В том случае,
                                                // когда метод возвращает -1 это говорит о том, что достигнут конец чтения файла.
                System.out.println((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close(); //закрываем поток
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStreamReader.close(); //закрываем поток
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

       ==========================================Запись в файл===============================================================  */
        //FileOutputStream fileOutputStream = null;
        FileWriter fileWriter = null;
        String str = " I love Jinx";
        File file = new File("F:/22.txt"); // создаёт новый объект в памяти, содержащий имя файла.
        {
            try {
                fileWriter = new FileWriter(file, true); // передаём новый созданый нами файл для записи
               //fileWriter = new FileWriter("F:/1.txt", true);// значение true даёт возможность дописывать записи не стирая страные.
                //fileOutputStream = new FileOutputStream("F:/1.txt"); данная функция при вводе новых записей стирает старые записи
                //fileOutputStream.write(str.getBytes());// вписываем значение переменной str и переводим её в байтовое значение
                fileWriter.write(str);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
