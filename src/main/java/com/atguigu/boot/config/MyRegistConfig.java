package com.atguigu.boot.config;

import com.atguigu.boot.servlet.MyFilter;
import com.atguigu.boot.servlet.MyServlet;
import com.atguigu.boot.servlet.MySwervletContextListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRegistConfig {
    @Bean
    public ServletRegistrationBean myServlet(){
        MyServlet myServlet = new MyServlet();
        return new ServletRegistrationBean(myServlet,"/my","/my02");
    }

    @Bean
    public FilterRegistrationBean myFilter(){

        return new FilterRegistrationBean(new MyFilter(),myServlet());
    }

    @Bean
    public ServletListenerRegistrationBean myListener(){

        return new ServletListenerRegistrationBean(new MySwervletContextListener());
    }



}
