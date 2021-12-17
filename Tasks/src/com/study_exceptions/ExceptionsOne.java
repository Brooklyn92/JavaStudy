package com.study_exceptions;

public class ExceptionsOne {
    public static void main(String[] args) {
        try {
            int[] num = new int[3];
            num[4]=50;
            System.out.println(num[4]);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Программа завершена");
    }
}
