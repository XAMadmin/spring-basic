package com.suhan.config;

import com.suhan.entity.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 使用xml配置文件
public class MainConfig {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        Student student = (Student) context.getBean("student");
        student.show();
        student.showSchool();
        student.achievement();
        student.test();
        System.out.println(student);


        context.close();

    }



}
