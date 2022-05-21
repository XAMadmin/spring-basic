package com.suhan.mapper;


import com.suhan.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface UserMapper {

    @Select("select * from user")
    User getUser();


}
