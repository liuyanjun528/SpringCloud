package com.example.demo.mapper;

import com.example.demo.enty.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends com.meditrusthealth.fast.common.page.Pagingable<User, User> {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}