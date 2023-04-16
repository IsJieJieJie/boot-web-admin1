package com.atguigu.boot.service;

import com.atguigu.boot.bean.City;
import com.atguigu.boot.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    CityMapper cityMapper;
    public City getCityById(Integer id){


        return cityMapper.getCityById(id);
    }

    public void saveCity(City city) {
        cityMapper.insertCity(city);
    }
}
