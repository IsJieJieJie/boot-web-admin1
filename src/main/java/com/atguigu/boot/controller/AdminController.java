package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Account;
import com.atguigu.boot.bean.City;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.service.AccountService;
import com.atguigu.boot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {


    @Autowired
    AccountService accountService;
    @Autowired
    CityService cityService;

    @ResponseBody
    @PostMapping("/saveCity")
    public void saveCity(City city){
        System.out.println('e');

        cityService.saveCity(city);
    }



    @ResponseBody
    @GetMapping("/getAcc")
    public Account getAcc(@RequestParam("id") Integer id){
        return accountService.getAccById(id);
    }

    @ResponseBody
    @GetMapping("/getCity")
    public City getCity(@RequestParam("id") Integer id){

        return cityService.getCityById(id);
    }

    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "test1";
    }

    @RequestMapping(value = {"/test1"})
    public String test1(){

        return "test1";
    }



    @PostMapping(value = "/login")
    public String main(User user, HttpSession session, Model model){
       if("admin".equals(user.getUserName())&&user.getPassWord()!=null){
           session.setAttribute("loginUser",user);
           return "redirect:/main.html";
       } else {
           model.addAttribute("msg","用户名或密码错误！");
           return "login";
       }

    }
    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){
        User user = (User) session.getAttribute("loginUser");
        if(user!=null){
            return "main";
        }else {
            model.addAttribute("msg","请先登录");
            return "login";
        }
    }













}