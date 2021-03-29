package com.lijunbo.service;

import com.lijunbo.domain.User;

import java.util.Map;

public interface UserService {

    //登录
    public User isLogin(Map map);

    //注册
    public boolean isRegister(Map map);



}
