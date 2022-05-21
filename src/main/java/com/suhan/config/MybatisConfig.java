package com.suhan.config;


import com.suhan.mapper.UserMapper;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@MapperScan("com.suhan.mapper")
@Slf4j
public class MybatisConfig {

    //SqlSessionTemplate加载配置文件加载数据库

//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate() throws IOException {
//
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis.xml"));
//
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }

    //默认连接池
//    @Bean
//    public DataSource dataSource(){
//        return new PooledDataSource(
//                "com.mysql.cj.jdbc.Driver",
//                "jdbc:mysql://192.168.37.128:3306/test",
//                "root",
//                "suhan@qq.com"
//        );
//    }

    //使用HikariCP连接池
    @Bean
    public  DataSource dataSource(){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://192.168.37.128:3306/test");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("suhan@qq.com");
        return  dataSource;
    }



    //SqlSessionFactoryBean去除配置文件加载数据库
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(@Autowired DataSource dataSource){
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean;

    }



    public static void main(String[] args) {
        log.info("项目正在启动。。。");
        ApplicationContext context = new AnnotationConfigApplicationContext(MybatisConfig.class);

        //1.SqlSessionTemplate
//        SqlSessionTemplate template = context.getBean(SqlSessionTemplate.class);
//        UserMapper userMapper = template.getMapper(UserMapper.class);
//        System.out.println(userMapper.getUser());

        //2.SqlSessionFactoryBean

        UserMapper userMapper1 = context.getBean(UserMapper.class);
        System.out.println(userMapper1.getUser());




    }




}
