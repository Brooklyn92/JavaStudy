package com.study_geberics.exp1;

public class TestGenerics {
    public static void main(String[] args) {
        Account<String> acc1 = new Account<String>("2334", 5000);
        String acc1Id = acc1.getId();
        System.out.println(acc1Id); //2334
        Account<Integer> acc2 = new Account<Integer>(2345, 5000); // т.к. тип поля id int, в классе Account меняем тип пол на Object
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
    }
}
