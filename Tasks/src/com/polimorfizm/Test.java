package com.polimorfizm;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog= new Dog();
        Cat cat=new Cat();
        test(animal);
        test(dog);
        test(cat);
        //Animal animal1=new Dog();
       // animal1.eat();  // переопределяется метод, который находится в потомке(new Dog()), а именно будет выводится метод класса Dog.
                        // Данная операция называется поздним связыванием
    }
    public static void test(Animal animal){ // данный метод обрабатывает три метода трёх классов по свойму
    animal.eat();
    }
}
