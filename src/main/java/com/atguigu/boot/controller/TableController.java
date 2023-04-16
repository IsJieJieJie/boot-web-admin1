package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Account;
import com.atguigu.boot.bean.Admin;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.service.impl.AdminServiceImpl;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TableController {
    @Autowired
    AdminServiceImpl adminService;


    @GetMapping(value = "/user/delete/{id}")
    public String deteleTable(@PathVariable("id")Long id,
                              @RequestParam(value = "pn",defaultValue = "1") Integer pn,
                              RedirectAttributes ra
                              ){
        adminService.removeById(id);
        String str1="我啊";
        str1.length();
           ra.addAttribute("pn");
        return "redirect:/dynamic_table";
    }
    @GetMapping("/dynamic_table")
    public String dynamicTable(Model model,@RequestParam(value = "pn",defaultValue = "1") Integer pn){

        Page<Admin> page =new Page(pn,4);
        Page<Admin> adminPage = adminService.page(page);

        model.addAttribute("users",adminPage);
        return "table/dynamic_table";
    }
    @RequestMapping("/testVue")
    @ResponseBody
    public Object testVue(@RequestBody() Account account3)

    {//postman发送后,自动把json格式转换成对象
        System.out.println(account3);

        List<Account> accountList = new ArrayList<>();
    Account account = new Account();
    account.setId(1);
    account.setMoney(50);
    account.setUserId("12");
        account.setUser(new User("name","password",23,'男',"email"));
        Account account1 = new Account();
        account1.setId(2);
        account1.setMoney(60);
        account1.setUserId("13");
        account1.setUser(new User("name1","password",23,'男',"email"));
    accountList.add(account);
    accountList.add(account1);
     return accountList;//自动把对象转换成json返回
    }


}
