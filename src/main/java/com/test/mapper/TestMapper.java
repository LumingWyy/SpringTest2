package com.test.mapper;

import com.test.bean.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


public interface TestMapper {

    @Select("select * from student where sid = 1")
    Student getStudent();

    @Insert("insert into student(name, age) value ('testname', 20)")
    void insertStudent();

}
