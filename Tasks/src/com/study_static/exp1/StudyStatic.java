package com.study_static.exp1;

public class StudyStatic {
    public static void main(String[] args) {
        Human1 h1=new Human1("Bob",40);
        Human1 h2=new Human1("Tom",44);
        Human1 h3=new Human1("Bobi",56);
        Human1 h4=new Human1("Tomas",66);
        Human1.printNumberOfPeople();



    }
}


class Human1{
    private String name;
    private int age;
   private static int countPeople;

    public Human1(String name,int age){
        this.name=name;
        this.age=age;
        countPeople++;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
   public static void printNumberOfPeople(){
       System.out.println("Nubmer of people is " + countPeople);
   }
   /*
static {
    System.out.println("Статический инициализатор");
}

    */
}
