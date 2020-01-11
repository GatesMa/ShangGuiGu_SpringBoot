package com.gatesma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright (C), 2020
 * FileName: HelloWorldMainApplication
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/11 15:39
 * Description:
 */

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        // Spring 应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);

    }
}
