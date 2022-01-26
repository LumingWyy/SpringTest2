package com.test.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

//@ToString
//@Component
@Data
public class Student {
    int sid;
    String name;
    int age;
    //    String name;
    //@Resource
//    Card card;

//    public Student() {
//        System.out.println("i am constructor ");
//
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//    @Autowired
////    @Qualifier("bbb")
////    public void setCard (Card card) {
////        System.out.println("i am injection");
////        this.card = card;
////    }
//    @PostConstruct
//    public void init() {
//        System.out.println("shuxing card " + card);
//    }\
//    public void say(String text) {
//        System.out.println("i am "+name +" age "+ age + " say " +text);
//
//    }

}
