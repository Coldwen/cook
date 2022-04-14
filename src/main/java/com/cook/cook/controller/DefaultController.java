package com.cook.cook.controller;

import com.cook.cook.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@CrossOrigin //所有域名均可访问该类下所有接口
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DefaultController {

    @GetMapping
    public String sayHello(){
        return "欢迎！";
    }
}
