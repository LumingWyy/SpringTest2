package com.test.bean;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@ToString
@Component
public class Student {
    int age;
    String name;

    Card card;

    public void setName(String name) {
        this.name = name;
    }
    @Autowired
    @Qualifier("bbb")
    public void setCard(Card card) {
        System.out.println("set() inject prpty");
        this.card = card;
    }
}
