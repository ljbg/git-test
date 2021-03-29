package com.lijunbo.service;

import com.lijunbo.domain.Types;

import java.util.List;

public interface TypeService {

    //查找所有电影类型
    public List<Types> findAll();
}
