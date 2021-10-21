package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        switch (x){
            case 0:
                System.out.println("Не правильно");
                break;
            case 5:
                System.out.println("Правильно");
                break;
            default:
                System.out.println("Ничего не правильно");
        }
    }
}
