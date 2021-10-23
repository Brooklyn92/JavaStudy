package com.company;

public class StudyObjectAndMethodtoString {
    public static void main(String[] args) {
     Person1 p1=new Person1("Bob",26);
        System.out.println(p1.toString()); /*   При данном вызове, выведеться в консоль хешкод, который выполняет невидимый метод
                                                toString (p1.toString) класса Object.
                                                Каждый класс по умолчанию унаследываются у невидимого клсса Object.
                                                Хэшкод будет выводиться до тех пор, пока метод toString будет не переопределён.
                                           */
    }
}
class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+ ", " + age;  /* переопределяем метод toSring класса Object,который изначально выводил в консоль хешкод объекта Person1,
                                     в вывод поля name и age класса Person1,от котрого был создан объекта p1.
                                  */
    }
}
