package com.test.service;

import com.test.bean.Student;
import com.test.mapper.TestMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Component
public class TesServiceImpl implements TestService{

    @Resource
    TestMapper testMapper;

    @Override
    public Student getStudent(){
        return testMapper.getStudent();
    }
    @Transactional
    @Override
    public void test() {
        testMapper.insertStudent();
        test2();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public void test2() {
        testMapper.insertStudent();
        throw new RuntimeException("im exception");
    }
}
