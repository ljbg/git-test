package com.lijunbo.dao;

import com.lijunbo.domain.Types;

import java.util.List;

public interface TypeMapper {

    //查询所有电影类型
    public List<Types> selectAll();

}
