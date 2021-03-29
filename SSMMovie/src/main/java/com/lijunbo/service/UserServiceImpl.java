package com.lijunbo.service;

import com.lijunbo.dao.MovieMapper;
import com.lijunbo.dao.UserMapper;
import com.lijunbo.domain.User;

import java.util.Map;

public class UserServiceImpl implements UserService {

    //service 层调用 dao 层
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User isLogin(Map map) {
        User user = userMapper.selectByNameAndPassword(map);
        return user;
    }

    public boolean isRegister(Map map) {
        User user = userMapper.selectByName(map);
        if( user == null){
            userMapper.insertUser(map);
            return true;
        }else {
            return false;
        }
    }
}
