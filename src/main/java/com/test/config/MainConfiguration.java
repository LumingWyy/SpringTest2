package com.test.config;

import com.test.bean.Card;
import com.test.bean.Student;
import com.zaxxer.hikari.HikariConfigMXBean;
import com.zaxxer.hikari.HikariDataSource;
import lombok.SneakyThrows;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;

@EnableAspectJAutoProxy

//@ComponentScans({
//        @ComponentScan("com.test.bean"),
//        @ComponentScan("com.test.aop")
//})
@EnableTransactionManagement
@ComponentScan("com.test.bean")
@MapperScan("com.test.mapper")
@ComponentScan("com.test")
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
    public TransactionManager transactionManager(@Autowired DataSource source){
        return new DataSourceTransactionManager(source);
    }
    @Bean
    public DataSource dataSource() throws SQLException {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://192.168.56.103:3306/Study");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
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
