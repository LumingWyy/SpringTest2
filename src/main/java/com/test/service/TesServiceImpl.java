package com.test.service;

import com.test.bean.Student;
import com.test.mapper.TestMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TesServiceImpl implements TestService{

    @Resource
    TestMapper testMapper;

    @Override
    public Student getStudent(){
        return testMapper.getStudent();
    }

}
