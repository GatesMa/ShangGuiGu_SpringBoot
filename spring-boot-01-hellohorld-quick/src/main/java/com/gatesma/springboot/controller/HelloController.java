package com.gatesma.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2020
 * FileName: HelloController
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/11 18:21
 * Description:
 */

//@Controller
//@ResponseBody
//这个类的所有方法返回的数据直接写给浏览器，（如果是对象转为json数据）
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world quick!";
    }


}
