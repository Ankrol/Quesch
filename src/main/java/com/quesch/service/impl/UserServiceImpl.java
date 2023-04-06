package com.quesch.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.crypto.SecureUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.quesch.entity.User;
import com.quesch.entity.request.ChangeInfoRrequest;
import com.quesch.entity.request.UserRequest;
import com.quesch.exception.ServiceException;
import com.quesch.service.UserService;
import com.quesch.mapper.UserMapper;
import com.quesch.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

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

    private static final String PASS_SALT = "1213";

    public User register(UserRequest userRequest){
//        查询是否用户名已存在
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",userRequest.getUsername());
        if(userMapper.selectOne(wrapper)==null){
            throw new ServiceException("用户名已存在");
        }
        User user = new User();
        Date date = new Date();
//        ID自生成
        user.setId(DateUtil.format(date,"yyyyMMdd")+Math.abs(IdUtil.fastSimpleUUID().hashCode()));
        user.setUsername(userRequest.getUsername());
        user.setPhone("12345");
        user.setPassword(securePass(userRequest.getPassword()+PASS_SALT));
        userMapper.insert(user);
        return user;
    }
    
    public User login(UserRequest request){
        request.setPassword(securePass(request.getPassword()+PASS_SALT));
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",request.getUsername());
        User res = userMapper.selectOne(wrapper);
        String token = TokenUtils.genToken(String.valueOf(res.getId()),res.getPassword());
        res.setToken(token);
        return res;
    }

    public Integer changeInfo(ChangeInfoRrequest changeInfoRrequest){
        User user = new User();
        user.setId(changeInfoRrequest.getId());
        user.setUsername(changeInfoRrequest.getUsername());
        user.setPassword(securePass(changeInfoRrequest.getPassword()+PASS_SALT));
        int res = userMapper.updateById(user);
        return res;
    }

    public String securePass(String password){
        return SecureUtil.md5(password+PASS_SALT);
    }

}




