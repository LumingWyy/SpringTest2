package com.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class AopTest {

//    @Before("execution(* com.test.bean.Student.say(..))")
//    public void before(JoinPoint joinPoint) {
//        System.out.println(Arrays.toString(joinPoint.getArgs()));
//        System.out.println("before!");
//
//    }
//
//    @AfterReturning(value = "execution(* com.test.bean.Student.say(..))", returning = "val")
//    public void after(Object val) {
//        System.out.println("after" + val);
//
//    }

    @Around(value = "execution(* com.test.bean.Student.say(..))")
    public Object after(ProceedingJoinPoint point) throws Throwable {
        System.out.println("Abefore");
        Object val = point.proceed();
        System.out.println("Aafter");
        return val;
    }
}
