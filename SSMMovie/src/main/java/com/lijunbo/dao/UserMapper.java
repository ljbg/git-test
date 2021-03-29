package com.lijunbo.dao;

import com.lijunbo.domain.User;

import java.util.Map;

public interface UserMapper {

    //通过用户名和密码查询用户
    public User selectByNameAndPassword(Map map);

    //通过用户名查询用户
    public User selectByName(Map map);

    //插入用户
    public void insertUser(Map map);

}
