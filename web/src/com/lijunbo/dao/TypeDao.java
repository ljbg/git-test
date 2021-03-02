package com.lijunbo.dao;

import com.lijunbo.domain.Types;
import com.lijunbo.util.ConnUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeDao {
    public List<Types> selectAll() throws SQLException {
        List<Types> typeList = new ArrayList<Types>();
        String sql = "select * from movies_type  ";
        Connection conn = ConnUtil.getConn();
        PreparedStatement pstat = conn.prepareStatement(sql);
        ResultSet rs = pstat.executeQuery();
        while(rs.next()){
            Types type = new Types();
            type.setType_id(rs.getInt(1));
            type.setType_name(rs.getString(2));
            typeList.add(type);
        }
        return typeList;
    }
}
