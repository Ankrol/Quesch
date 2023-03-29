package com.quesch.controller;

import com.quesch.common.Result;
import com.quesch.entity.User;
import com.quesch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(){
        String name = "user1";
        User user = userService.selectUser(name);
        return Result.success(user);
    }
}
