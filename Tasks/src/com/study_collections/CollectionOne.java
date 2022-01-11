package com.study_collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionOne {
    public static void main(String[] args) {
        /*Collection collection = new ArrayList();
        collection.add("hi"); // добавление элемента в коллекцию
        collection.add("Arcane");
        collection.add("Vi");
        for (Object col : collection) {
            System.out.println(col);
        }
        System.out.println(collection.contains("Arcane")); // проверка существования элемента в коллекции
        collection.remove("Vi"); // удаление элемента из коллекции
        System.out.println(collection);
        System.out.println(collection.size()); // проверка размерности коллекции
        collection.clear(); // удаление всей коллекции
        System.out.println(collection);

         */
        //=====ArrayList==============
        ArrayList<String> people = new ArrayList<String>();
        people.add("Tom");
        people.add("Alex");
        people.add(1, "Max"); // установка объекту индекса
       // System.out.println(people.get(1));// вывод объекта по индексу 1
        people.set(1, "Robert"); // установка нового значения оъекту с индексом 1
        //System.out.println(people.get(1)); // вывод обновлённого объекта по индексу 1
        for (String p: people) {
            System.out.println(p);
        }
    }
}