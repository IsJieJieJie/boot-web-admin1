package com.atguigu.boot;

import com.atguigu.boot.bean.Admin;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.mapper.AdminMapper;
import com.atguigu.boot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootTest
class BootWebAdminApplicationTests {
     @Autowired
    JdbcTemplate jdbcTemplate;
     @Autowired
     UserMapper userMapper;
     @Autowired
    AdminMapper adminMapper;
    @Test
    void contextLoads() {
    StringBuilder stringBuilder = new StringBuilder(0);
        System.out.println(stringBuilder);
    }

}
