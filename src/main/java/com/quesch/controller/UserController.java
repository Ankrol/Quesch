package com.quesch.controller;

import com.quesch.common.Result;
import com.quesch.entity.User;
import com.quesch.entity.request.RegisterUser;
import com.quesch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class RegisterController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(@RequestBody RegisterUser registerUser){
        User user = new User();
        user.setId(3);
        user.setUsername(registerUser.getUsername());
        user.setPassword(registerUser.getPassword());
        user.setPhone("12345");
        userService.login(user);
        return Result.success(user);
    }
}
