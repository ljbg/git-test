package com.lijunbo.service;

import com.lijunbo.dao.TypeMapper;
import com.lijunbo.domain.Types;

import java.util.List;

public class TypeServiceImpl implements TypeService {

    private TypeMapper typeMapper;

    public void setTypeMapper(TypeMapper typeMapper) {
        this.typeMapper = typeMapper;
    }

    public List<Types> findAll() {
     return   typeMapper.selectAll();
    }
}
