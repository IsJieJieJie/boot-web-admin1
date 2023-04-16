package com.atguigu.boot.mapper;

import com.atguigu.boot.bean.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {
    @Select("select * from city where id = #{id}")
    public City getCityById(Integer id);

    public void insertCity(City city);

 }
