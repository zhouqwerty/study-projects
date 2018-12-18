package com.qwerty.zhou.module.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther wangzb
 * @date 2018/11/9 21:32
 */
@Controller
@EnableAutoConfiguration
public class HelloWorld {

    @RequestMapping(value = "/sayHello")
    @ResponseBody
    public String sayHello(String name){
        return "Hello," + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class, args);
    }
}