package com.study_exceptions;

import java.util.Scanner;

public class ExceptionsTwo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if(x>=30){
                throw new Exception("Число должно быть меньше 30");
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
