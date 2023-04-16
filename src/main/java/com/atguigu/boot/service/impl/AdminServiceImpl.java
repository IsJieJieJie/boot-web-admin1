package com.atguigu.boot.service.impl;

import com.atguigu.boot.bean.Admin;
import com.atguigu.boot.mapper.AdminMapper;
import com.atguigu.boot.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper,Admin> implements AdminService {


}
