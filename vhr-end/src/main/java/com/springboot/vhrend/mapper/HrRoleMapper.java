package com.springboot.vhrend.mapper;

import com.springboot.vhrend.model.HrRole;

public interface HrRoleMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(HrRole record);
    int insertSelective(HrRole record);
    HrRole selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(HrRole record);
    int updateByPrimaryKey(HrRole record);
}