package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//自动装配
@RestController
public class hellocontroller {
    //接口  http://localhost:8080/hello
    @RequestMapping("/hello")
    public String hello(){
        return "hello world 你好啊 spring boot";
    }
}
