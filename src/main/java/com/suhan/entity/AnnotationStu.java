package com.suhan.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Data
@Component
public class AnnotationStu {

    int id;
    String name;
    int age;

    @Resource
    AnnotationSchool school;

    @PostConstruct
    public void init(){
        System.out.println("我是初始化方法!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("我是销毁方法。");
    }

    public void show(){

        school.showInfo();

        System.out.println("测试显示注解bean");

    }


    public void test(){
        System.out.println("我是被切入的测试方法");
    }



}
