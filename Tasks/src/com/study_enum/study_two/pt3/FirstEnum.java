package com.study_enum.study_two.pt3;

public enum FirstEnum {

    FIRST_ENUM("firstLocator", "//div"),
    SECOND_ENUM("secondLocator", "//input");

    public String name;
    public String value;

    FirstEnum(String name, String value){
        this.name = name;
        this.value = value;
    }
}
