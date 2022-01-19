package com.study_geberics.exp5;

public class TestGenerics4 {
    public static void main(String[] args) {
        //Использование нескольких универсальных параметров
        Account4<String, Double> acc1 = new Account4<String, Double>("354", 5000.87);
        String id = acc1.getId();
        Double sum = acc1.getSum();
        System.out.println(id + " " + sum);
    }
}
