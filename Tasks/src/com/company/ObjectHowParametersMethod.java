package com.company;

public class ObjectHowParametersMethod {
    public static void main(String[] args) {
        PersonOne kate=new PersonOne("Kate");
        System.out.println(kate.getName());
        changeName(kate);
        System.out.println(kate.getName());
    }
    static void changeName(PersonOne p){
        p.setName("Anastasia");
    }
}

class PersonOne{
    private String name;

    PersonOne(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

}
