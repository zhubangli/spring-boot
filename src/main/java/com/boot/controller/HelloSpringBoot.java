package com.boot.controller;

import com.boot.entity.School;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloSpringBoot {

    @Value("${server.port}")
    private Integer port;

    @Value("${school.name}")
    private String name;

    @Resource
    private School school;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return port + "欢迎使用SpringBoot" + name + school;
    }

    @RequestMapping("/user/login")
    @ResponseBody
    public String userLogin() {
        return "访问user/login";
    }

    @RequestMapping("/user/exit")
    @ResponseBody
    public String userExit() {
        return "访问user/exit";
    }



}
