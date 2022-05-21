package com.suhan.entity;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AnnotationSchool {

    int id;
    String schName;
    String addr;


    public void showInfo(){
        System.out.println(String.format("学校名称：%s, 学校地址：%s", this.schName, this.addr));
    }


}
