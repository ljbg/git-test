package com.lijunbo.dao;

import com.lijunbo.domain.User;
import com.lijunbo.util.ConnUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    public User selectByNameAndPassword(String userName, String userPassword) throws SQLException {
        String sql = "select * from user "+"where user_name=? and user_pass=?";
        Connection conn = ConnUtil.getConn();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,userName);
        ps.setString(2,userPassword);
        ResultSet rs = ps.executeQuery();
       if (rs.next()){
           User user = new User();
           user.setUserId(rs.getInt(1));
           user.setUserName(rs.getString(2));
           user.setUserPassword(rs.getString(3));
           user.setUserPhone(rs.getString(4));
           return user;
       }else{
           return null;
       }
    }

    public User selectByName(String userName) throws SQLException{
        String sql = "select * from user "+"where user_name=?";
        Connection conn = ConnUtil.getConn();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,userName);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            User user = new User();
            user.setUserId(rs.getInt(1));
            user.setUserName(rs.getString(2));
            user.setUserPassword(rs.getString(3));
            user.setUserPhone(rs.getString(4));
            return user;
        }else{
            return null;
        }
    }

    public void insertUser(String userName,String userPassword,String userPhone) throws SQLException{
        String sql = "insert into user(user_name,user_pass,user_phone) values(?,?,?)";
        Connection conn = ConnUtil.getConn();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,userName);
        ps.setString(2,userPassword);
        ps.setString(3,userPhone);
        ps.executeUpdate();
    }

}
