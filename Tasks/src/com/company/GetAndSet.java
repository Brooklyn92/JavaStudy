package com.company;

public class GetAndSet {
    public static void main(String[] args) {
        Car car=new Car();
        car.setMarka("FORD");
        car.setCount(300000);
        System.out.println(car.getMarka()+ " " + car.getCount());
    }
}

class Car {
    private String marka;
    private int count;

    public void setMarka(String marka1) {
        this.marka = marka1;
    }
    public String getMarka() {
        return marka;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}