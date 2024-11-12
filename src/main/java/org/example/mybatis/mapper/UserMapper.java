package org.example.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.mybatis.entity.User;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO users (name, email) VALUES (#{name}, #{email})")
    void insertUser(@Param("name") String name, @Param("email") String email);


    @Select("SELECT * FROM users WHERE name = #{name} OR email = #{email}")
    User selectUserByNameOrEmail(@Param("name") String name, @Param("email") String email);

//    @Select("SELECT * FROM users WHERE name = #{name} OR email = #{email}")
//    User selectUserByNameOrEmail(@Param("name") String name, @Param("email") String email, @Param("email") String emai1l);
}