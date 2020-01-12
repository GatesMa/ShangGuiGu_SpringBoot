package com.gatesma.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * Copyright (C), 2020
 * FileName: HelloController
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/12 17:08
 * Description:
 */

@Controller
public class HelloController {

//    @RequestMapping({"/", "/index.html"})
//    public String index() {
//        return "index";
//    }


    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }



}
