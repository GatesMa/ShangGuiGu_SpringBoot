package com.gatesma.springboot.config;

import com.gatesma.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (C), 2020
 * FileName: MyAppConfig
 * Author:   Marlon
 * Email: gatesma@foxmail.com
 * Date:     2020/1/12 10:17
 * Description:
 */
/**
 * @Configuration：指明当前类是一个配置类；就是来替代之前的Spring配置文件
 *
 * 在配置文件中用<bean><bean/>标签添加组件
 *
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中，默认ID是方法名
    @Bean
    public HelloService helloService() {
        System.out.println("@Bean添加组件了：");
        return new HelloService();
    }

}
