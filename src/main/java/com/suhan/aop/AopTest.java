package com.suhan.aop;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class AopTest {

    public void after(){
        System.out.println("我是切入执行之后的方法！");
    }

    public void before(JoinPoint joinPoint){
        System.out.println("我是切入执行之前的方法！");
        System.out.println(joinPoint.getTarget());
        System.out.println(Arrays.toString(joinPoint.getArgs()));
    }
}
