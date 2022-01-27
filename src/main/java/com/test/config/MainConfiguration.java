package com.test.config;

import com.test.bean.Card;
import com.test.bean.Student;
import lombok.SneakyThrows;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.util.Date;

@EnableAspectJAutoProxy

//@ComponentScans({
//        @ComponentScan("com.test.bean"),
//        @ComponentScan("com.test.aop")
//})
@MapperScan("com.test.mapper")
@ComponentScan("com.test.service")
@Configuration
//@Import({TestConfiguration.class, Date.class})
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
//    @SneakyThrows
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate() {
//        return new SqlSessionTemplate(
//                new SqlSessionFactoryBuilder()
//                        .build(Resources.getResourceAsReader("mybatis-config.xml")));
//    }

    @Bean
    public DataSource dataSource() {
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setUrl("jdbc:mysql://192.168.56.103:3306/Study");
        dataSource.setDriver("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Autowired DataSource source) {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(source);
        return bean;
    }

}
