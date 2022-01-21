package com.test;

import com.test.bean.Card;
import com.test.bean.Student;
import com.test.config.MainConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Student student = context.getBean(Student.class);
        System.out.println(student);
//        Card card = context.getBean(Card.class);
//        System.out.println(card);
    }
}
