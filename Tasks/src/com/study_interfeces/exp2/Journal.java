package com.study_interfeces.exp2;


public class Journal implements Printable {
    private String name;

public Journal(String name) {
        this.name = name;
    }

    String getName() {
       return name;
    }

public void print() {
        System.out.println(name);
    }
}
