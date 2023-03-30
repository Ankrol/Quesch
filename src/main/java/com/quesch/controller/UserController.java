package com.quesch.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import com.quesch.common.Result;
import com.quesch.entity.User;
import com.quesch.entity.request.UserRequest;
import com.quesch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody UserRequest userRequest){
        User res = userService.login(userRequest);
        System.out.println(res.getPassword()+".."+userRequest.getPassword());
        if(res.getPassword().equals(userRequest.getPassword())){
            return Result.success(res);
        }
        return Result.error("登录失败");
    }

    @PostMapping("/register")
    public Result register(@RequestBody UserRequest userRequest){
        User user = userService.register(userRequest);
        return Result.success(user);
    }
}
