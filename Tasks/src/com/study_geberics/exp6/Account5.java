package com.study_geberics.exp6;

public class Account5 {
    private String id;
    private int sum;
//Обобщенный конструктор
    <T>Account5(T id, int sum) {
        this.id = id.toString();
        this.sum = sum;
    }
    public String getId(){
        return id;
    }
    public int getSum(){
        return sum;
    }
    public void setSum(int sum){
        this.sum = sum;
    }
}
