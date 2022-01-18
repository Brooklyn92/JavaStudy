package com.study_geberics.exp3;

public class Account3<T> implements Accountable1<T> {
    private T id;
    private int sum;

    Account3(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
}
