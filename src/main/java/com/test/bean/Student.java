package com.test.bean;

import lombok.ToString;

@ToString
public class Student {
    int age;
    String name;
    Card card;

    public void setName(String name) {
        this.name = name;
    }
}
