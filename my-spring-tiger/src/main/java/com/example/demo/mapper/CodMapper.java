package com.example.demo.mapper;

import com.example.demo.enty.Cod;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CodMapper extends com.meditrusthealth.fast.common.page.Pagingable<Cod, Cod> {
    int deleteByPrimaryKey(Integer codeid);

    int insert(Cod record);

    int insertSelective(Cod record);

    Cod selectByPrimaryKey(Integer codeid);

    int updateByPrimaryKeySelective(Cod record);

    int updateByPrimaryKey(Cod record);
}