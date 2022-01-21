package com.test.config;

import com.test.bean.Card;
import com.test.bean.Student;
import org.springframework.context.annotation.*;

@ComponentScan("com.test.bean")
//@ComponentScans({
//
//})
@Configuration
public class MainConfiguration {
//
//    @Bean
//    @Scope("prototype")
//    public Card card() {
//        return new Card();
//    }
//
//    @Bean
//    public Student student(){
//        Student student= new Student();
//        student.setName("Tom");
//        return student;
//    }
}
