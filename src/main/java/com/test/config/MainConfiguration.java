package com.test.config;

import com.test.bean.Card;
import com.test.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import java.util.Date;

@EnableAspectJAutoProxy

@ComponentScans({
        @ComponentScan("com.test.bean"),
        @ComponentScan("com.test.aop")
})
@Configuration
@Import({TestConfiguration.class, Date.class})
public class MainConfiguration {
//    @Bean("aaaaa")
//    public Card card() {
//        return new Card();
//    }
//    @Bean
//    public Student student(@Autowired Card card){
//        Student student= new Student();
//        student.setCard(card);
//        return student;
//    }
}
