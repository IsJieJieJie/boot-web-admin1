package com.atguigu.boot.mapper;

import com.atguigu.boot.bean.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {

    public Account getAccById(int id);
}
