package com.company;

import java.awt.*;

public class ClassesAndObject {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setName("Александр");
        person1.setAge(46);
        System.out.println("Выводим значение в main методе:" + person1.getName());
        System.out.println("Выводим значение в main методе:" + person1.getAge());

        //person1.setNameAndAge("Aleksandr",28);
        //person1.sayHello();
        //person1.speak();
        //String s1="Катя";
        //Person person2=new Person();
       // person2.speak();
        //int years1=person1.calculateYarsToRetiremeny(); // переменной years1 присваиваем результат метода calculateYarsToRetiremeny ( return years)
        //System.out.println(years1);



    }
}
class Person{
  private   String name;
   private int age;
    /*void setNameAndAge(String username, int userage){
        name=username;
        age=userage;

     */
public void setName(String userName){
   if (userName.isEmpty()){
        System.out.println("Ты ввёл пустое имя");
    }
   else {
       this.name = userName;
   }
    }
    public String getName(){
    return this.name;
    }
    public void setAge(int userage){
   if(userage<0){
        System.out.println("Возраст должен быть положительный");
    }
    else {
        this.age=userage;
    }
    }
    public int getAge(){
    return this.age;
    }





  int calculateYarsToRetiremeny(){
        int years=65-age;
        return years;// после выполнения команды return, метод прекращает работу. Писать после команды return нет никакого смысла
    }
    void speak(){

            System.out.println("Меня зовут "+ name + " и мне " + age + " лет");
        }

    void sayHello(){
        System.out.println("Привет");
    }
}
