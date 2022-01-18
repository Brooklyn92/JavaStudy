package com.study_class_object;

public class TestClassObject {
    public static void main(String[] args) {
        Person person = new Person("Tom");
        Person person1 = new Person("Tom");
        System.out.println(person.toString()); // com.study_class_object.Person@43a25848.
                                               // После переопределения выводится результат: Person Tom
        System.out.println(person.hashCode()); // до переопределения 586617651. После переопределения 863196
        System.out.println(person.getClass()); // class com.study_class_object.Person
        System.out.println(person.equals(person1)); //true


    }
}
