package com.suhan.entity;

import java.util.List;

public class School {

    int id;
    String address;

    List<String>list;

    public School(){

        System.out.println("学校构造方法，无参");
    }

    //有参构造
    public School(int id, String address){

        this.id = id;
        this.address = address;
        System.out.println("学校构造方法, 有参");

    }


    public void setAddress(String address){
        this.address = address;
    }

    public void setList(List<String> list){
        this.list = list;
    }





}
