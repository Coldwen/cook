package com.cook.cook.controller;

import com.cook.cook.mapper.UserMapper;
import com.cook.cook.service.UserService;
import com.cook.cook.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    UserService userService;

    UserMapper userMapper;

    @GetMapping("/")
    List<UserVo> list(){
        return userService.list().stream().map(userMapper::toVo).collect(Collectors.toList());
    }

    @Autowired(required=false)
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }
}
