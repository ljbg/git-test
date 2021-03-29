package com.lijunbo.service;

import com.lijunbo.dao.TypeDao;
import com.lijunbo.domain.Types;
import com.lijunbo.util.ConnUtil;

import java.sql.SQLException;
import java.util.List;

public class TypeService {
    private TypeDao typeDAO = new TypeDao();
    public List<Types> findAll() {
        try {
            return this.typeDAO.selectAll();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            ConnUtil.closeConn();
        }
    }
}
