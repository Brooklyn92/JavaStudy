package com.study_geberics.exp6;

public class TestGenerics5 {
    public static void main(String[] args) {
        Account5 acc1 = new Account5("cid123", 5000);
        Account5 acc2 = new Account5(54345,54433);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
        System.out.println(acc1.getSum());
    }
}
