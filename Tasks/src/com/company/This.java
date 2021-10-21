package com.company;

public class This {
    public static void main(String[] args) {
        Human human1=new Human();
        human1.setAge(28);
        human1.setName("Aleksandr");
        human1.getInfo();
    }
}

class Human{
    private String name;
    private int age;
    public void setName(String name){
       this.name=name; //  this.name указывает на переменную name = private String name
   }
   public void setAge(int age){
       this.age=age;
   }
   public String getName() {
       return name;
   }
   public int getAge(){
       return age;
   }
   public void getInfo(){
       System.out.println(name + ", " + age);
   }
}