package org.example.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    @Insert("INSERT INTO users (name, email) VALUES (#{name}, #{email})")
    void insertUser(@Param("name") String name, @Param("email") String email);
}