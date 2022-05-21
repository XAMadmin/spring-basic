package com.suhan.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationAop {

    @Before("execution(* com.suhan.entity.AnnotationStu.test())")
    public void before(){
        System.out.println("我是执行之前的方法");
    }




}
