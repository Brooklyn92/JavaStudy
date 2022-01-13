package com.study_interfeces.exp1;

public class Test {
    public static void main(String[] args) {
        //Info info1=new Animal(1);
        //Info info2=new Person("Bobi");
        //info1.showInfo();
        //info2.showInfo();
        //=================================
        Animal animal1=new Animal(1);
        Person person1=new Person("Bob");
        outputInfo(animal1);
        outputInfo(person1);

    }
    public static void outputInfo(Info info){
        info.showInfo();
    }

}
