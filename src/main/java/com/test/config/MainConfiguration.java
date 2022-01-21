package com.test.config;

import com.test.bean.Card;
import com.test.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@ComponentScan("com.test.bean")
//@ComponentScans({
//
//})
@Configuration
public class MainConfiguration {


    @Bean("aaaaa")
    public Card card() {
        return new Card();
    }

//    @Bean
//    public Student student(@Autowired Card card){
//        Student student= new Student();
//        student.setCard(card);
//        return student;
//    }
}
