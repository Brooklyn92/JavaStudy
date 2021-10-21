package com.company;

public class Task1 {
    public static void main(String[] args) {
        //123 --> "123"
        //999 --> "999"
        int a=123;
        int b=999;
        numberToString(a);
        System.out.println(a);
        numberToString(b);
        System.out.println(b);
    }
    public static String numberToString(  int num) {
        String s1=Integer.toString(num);
        return s1;
    }
}
