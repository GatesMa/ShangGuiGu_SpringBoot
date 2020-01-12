package com.gatesma.springboot.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2020
 * FileName: HelloController
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/12 12:41
 * Description:
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Boot";
    }

}
