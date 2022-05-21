package com.suhan.config;


import com.suhan.entity.AnnotationStu;
import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Date;


//使用注解配置文件
@Configuration
//自动扫描包注册bean

@ComponentScans(
        {
                @ComponentScan("com.suhan.entity"),
                @ComponentScan("com.suhan.aop"),
        }
)
//AOP注解
@EnableAspectJAutoProxy
@Import(Date.class)
public class AnnotationConfig {

//    @Bean
//    //原型模式
//    @Scope("prototype")
//    public AnnotationStu stu() {
//        return new AnnotationStu();
//    }
    @Resource
    Date date;

    @PostConstruct
    public void init(){
        System.out.println(date);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        AnnotationStu stu = context.getBean(AnnotationStu.class);
        System.out.println(stu);
        stu.show();
        stu.test();
        context.close();




    }


}
