package com.study_interfeces.exp2;

public class TestInterface1 {
    public static void main(String[] args) {
        Book book = new Book("Arcane", "Riot Games");
        book.print(); //Arcane (Riot Games)
        //Класс Book и класс Journal связаны тем, что они реализуют интерфейс Printable.
        //Поэтому мы динамически в программе можем создавать объекты Printable как экземпляры обоих классов
        Printable printable = new Book("Arcane Season One", "Riot Games");
        printable.print(); // Arcane Season One (Riot Games)
        printable = new Journal("Jinx");
        printable.print(); //Jinx
    }
}
