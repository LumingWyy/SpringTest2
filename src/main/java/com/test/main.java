package com.test;

import com.test.bean.Card;
import com.test.bean.Student;
import com.test.bean.Teacher;
import com.test.config.MainConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class main {
    public static void main(String[] args) throws InterruptedException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Student student = context.getBean(Student.class);
        //System.out.println(student);
        student.say("aaaaa");
//        Card card = context.getBean(Card.class);
//        System.out.println(card);
        Teacher teacher = context.getBean(Teacher.class);
        System.out.println(teacher);

        System.out.println( context.getBean(Date.class));
        Thread.sleep(3000);
        System.out.println( context.getBean(Date.class));

    }
}
