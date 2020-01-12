package com.gatesma.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Copyright (C), 2020
 * FileName: LoginController
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/12 21:54
 * Description:
 */

@Controller
public class LoginController {

//    @DeleteMapping
//    @PutMapping
//    @GetMapping

    //@RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){ //, HttpSession session
        if(!StringUtils.isEmpty(username) && "123456".equals(password)){
            //登陆成功，防止表单重复提交，可以重定向到主页
//            return "dashboard";
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else{
            //登陆失败

            map.put("msg","用户名或密码错误");
            return  "login";
        }

    }
}
