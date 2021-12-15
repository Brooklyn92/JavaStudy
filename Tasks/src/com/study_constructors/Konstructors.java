package com.study_constructors;

public class Konstructors {
    public static void main(String[] args) {
     Humann human1= new Humann("Aleksandr",28);
     human1.getInfo();


    }
}
class Humann{
    private String name;
    private int age;

    public Humann(){
        this.name="Имя по умолчанию";
        this.age=0;
    }
    public Humann(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void getInfo(){
        System.out.println(name+ ", " + age);
    }
}