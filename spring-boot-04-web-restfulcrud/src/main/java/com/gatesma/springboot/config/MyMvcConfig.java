package com.gatesma.springboot.config;

import com.gatesma.springboot.component.LoginHandlerInterceptor;
import com.gatesma.springboot.component.MyLocaleResolver;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;

/**
 * Copyright (C), 2020
 * FileName: MyMvcConfig
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/12 21:01
 * Description:
 */

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/gatesma").setViewName("success");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");

    }
//    @Bean
//    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
//        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
//            @Override
//            public void addViewControllers(ViewControllerRegistry registry) {
//                registry.addViewController("/").setViewName("index");
//                registry.addViewController("/index.html").setViewName("index");
//            }
//        };
//        return adapter;
//    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //静态资源；  *.css , *.js
        //SpringBoot已经做好了静态资源映射
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
           .excludePathPatterns("/index.html","/","/user/login", "/asserts/**", "/webjars/**");
    }

    @Bean
    public LocaleResolver localeResolver(){

        return new MyLocaleResolver();
    }

}
