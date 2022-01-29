package com.test.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component()
//@Scope("prototype")
public class Card {
    @Resource
    Student student;
}
