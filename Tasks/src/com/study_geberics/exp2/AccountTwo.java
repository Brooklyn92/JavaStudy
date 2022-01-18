package com.study_geberics.exp2;

public class AccountTwo implements Accountable<String>{
    private String id;
    private int sum;

    AccountTwo(String id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public String getId() {
        return id;
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
}
