package com.study_keyword_super.exp1;

public class B extends A {
    int i; // этот член скрывает член i из класса А

    public B(int a, int b) {
        super.i=a; // член i из класса А
        i=b; // член i из класса B
    }
    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}
