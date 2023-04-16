package com.atguigu.boot.service;

import com.atguigu.boot.bean.Account;
import com.atguigu.boot.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public Account getAccById(Integer id) {

        Account accById = accountMapper.getAccById(id);

        return accById;
    }


}
