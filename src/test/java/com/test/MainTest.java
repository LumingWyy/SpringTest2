package com.test;

import com.test.config.MainConfiguration;
import com.test.service.TestService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = MainConfiguration.class)
public class MainTest {

//    ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
    @Resource
//    @Autowired
    TestService service;

    @Test
    public void test() {
//        TestService service = context.getBean(TestService.class);
        service.test();
    }
}
