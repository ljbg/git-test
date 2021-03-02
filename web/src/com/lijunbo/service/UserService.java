package com.lijunbo.service;

import com.lijunbo.dao.UserDao;
import com.lijunbo.domain.User;
import com.lijunbo.util.ConnUtil;

import java.sql.SQLException;

public class UserService {

    private UserDao userDao = new UserDao();

    public User isLogin(String userName, String userPassword) {
        try {
            User user = userDao.selectByNameAndPassword(userName, userPassword);
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
            throw  new RuntimeException(e);
        } finally {
            ConnUtil.closeConn();
        }
    }

    public boolean isRegister(String userName, String userPassword,String userPhone)  {
        try {
            User user = userDao.selectByName(userName);
            if (user == null) {
                userDao.insertUser(userName,userPassword,userPhone);
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            ConnUtil.closeConn();
        }

    }

}
