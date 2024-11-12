package org.example.mybatis.spring;

import org.example.mybatis.entity.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "userService")
public class UserService {


    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    // 其他方法

    @Transactional
    public void transferMoney(String name  ,String  email) {
        Map map = new HashMap();
        map.put("name",name);
        map.put("email",email);
        // 从一个用户账户扣除金额
        List<Object> fromUser = sqlSessionTemplate.selectList("org.example.mybatis.mapper.UserMapper.selectUserByNameOrEmail",map);

        System.out.println(fromUser);
    }
}