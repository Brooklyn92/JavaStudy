package com.study_interfeces.exp3;

public interface Calculatable {
    //метод по умолчанию
    default int sum (int a, int b) {
        return sumAll(a,b);
    }
    //метод по умолчанию
    default int sum( int a, int b, int c) {
        return sumAll(a,b,c);
    }

    private int sumAll(int... values) {
        int result = 0;
        for (int n: values) {
            result = result+n;
        }
        return result;
    }
}
