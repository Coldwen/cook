package com.cook.cook.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@CrossOrigin //所有域名均可访问该类下所有接口
public class DefaultController {

    @GetMapping
    public String sayHello(){
        return "欢迎！";
    }
}
