package com.study_geberics.exp2;

public class TestGenericsInterface {
    public static void main(String[] args) {
        // В данном случае реализована первая стратегия, когда при реализации для универсального параметра
        // интерфейса задается конкретный тип, как например, в данном случае это тип String.
        // Тогда класс, реализующий интерфейс, жестко привязан к этому типу
        Accountable<String> acc1 = new AccountTwo("12345wr", 5000);
        AccountTwo acc2 = new AccountTwo("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
