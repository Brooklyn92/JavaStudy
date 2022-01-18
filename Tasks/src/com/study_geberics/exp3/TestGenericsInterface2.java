package com.study_geberics.exp3;

public class TestGenericsInterface2 {
    public static void main(String[] args) {
        // Вторая стратегия представляет определение обобщенного класса,
        // который также использует тот же универсальный параметр
     Account3<String> acc1 = new Account3<String>("1234wr", 5000);
     Account3<String> acc2 = new Account3<String>("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
