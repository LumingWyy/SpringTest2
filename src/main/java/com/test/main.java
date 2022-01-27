package com.test;

import com.test.bean.Card;
import com.test.bean.Student;
import com.test.bean.Teacher;
import com.test.config.MainConfiguration;
import com.test.mapper.TestMapper;
import com.test.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

@Slf4j
public class main {
    public static void main(String[] args) throws InterruptedException {
        log.info("Service start");
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
//        Student student = context.getBean(Student.class);
//        //System.out.println(student);
//        student.say("aaaaa");
//        Card card = context.getBean(Card.class);
//        System.out.println(card);
//        Teacher teacher = context.getBean(Teacher.class);
//        System.out.println(teacher);
//
//        System.out.println( context.getBean(Date.class));
//        Thread.sleep(3000);
//        System.out.println( context.getBean(Date.class));

//        SqlSessionTemplate template = context.getBean(SqlSessionTemplate.class);
//        TestMapper testMapper = template.getMapper(TestMapper.class);
//        System.out.println(testMapper.getStudent());
        TestService service = context.getBean(TestService.class);
        System.out.println(service.getStudent());
    }
}
