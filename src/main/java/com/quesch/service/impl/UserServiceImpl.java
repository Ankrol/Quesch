package com.quesch.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.quesch.entity.User;
import com.quesch.service.UserService;
import com.quesch.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author 77
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-03-29 10:21:37
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    @Resource
    private UserMapper userMapper;

    public User selectUser(String name){
        QueryWrapper wrapper = new QueryWrapper<>();
        wrapper.eq("username",name);
        User user = userMapper.selectOne(wrapper);
        System.out.println(user);
        return user;
    }
}




