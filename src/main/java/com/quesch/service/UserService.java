package com.quesch.service;

import com.quesch.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 77
* @description 针对表【user】的数据库操作Service
* @createDate 2023-03-29 10:21:37
*/
public interface UserService extends IService<User> {
    public User selectUser(String name);
}
