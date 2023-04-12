package com.quesch.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import com.quesch.common.Result;
import com.quesch.entity.User;
import com.quesch.entity.request.ChangeInfoRrequest;
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
        System.out.println(userRequest);
        User res = userService.login(userRequest);
        System.out.println("res"+res+"--"+res.getToken());
        if(res.getPassword().equals(userRequest.getPassword())){
//            不将密码传回
//            res.setPassword(null);
            return Result.success(res);
        }
        return Result.error("用户名或密码错误");
    }

    @PostMapping("/register")
    public Result register(@RequestBody UserRequest userRequest){
        User user = userService.register(userRequest);
        return Result.success(user);
    }

    @PutMapping("/changeInfo")
    public Result changeNameandPass(@RequestBody ChangeInfoRrequest changeInfoRrequest){
        Integer res = userService.changeInfo(changeInfoRrequest);
        if(res==1){
            return Result.success();
        }
        return Result.error("更新失败");
    }
}
