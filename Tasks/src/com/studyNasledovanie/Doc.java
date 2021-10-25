package com.studyNasledovanie;

public class Doc extends Animal {
public void bark(){
    System.out.println("I'm barking");
}
public void eat(){
    System.out.println("Doc is eating");
}

public void showName(){
    setName("Maks");
    System.out.println(getName());
}

}
