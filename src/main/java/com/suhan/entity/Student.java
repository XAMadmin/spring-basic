package com.suhan.entity;


import java.util.Map;

public class Student {

    String name;
    int age;
    School school;

    Map<String, Double>map;



    private void init(){
        System.out.println("我是初始化方法！");
    }

    private void destroy(){
        System.out.println("我是销毁方法！");
    }

    public Student(){
        System.out.println("我被构造了");
    }


    public void setName(String name){
        this.name = name;
    }

    public void setSchool(School school){
        this.school = school;
    }

    public void setMap(Map<String, Double> map){
        this.map = map;
    }

    public void show(){
        System.out.println(String.format("我的姓名：%s, 我的学校地址：%s", this.name, this.school.address));

    }

    public void showSchool(){
        System.out.println("学校含有学生:" + this.school.list);
    }

    public void achievement(){
        System.out.println("我的成绩：" + map);
    }

    public void test(){
        System.out.println("我是被切入的方法！");
    }



}
