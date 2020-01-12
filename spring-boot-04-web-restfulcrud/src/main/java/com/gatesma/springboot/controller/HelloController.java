package com.gatesma.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

}
