package com.zhong.service;

import com.zhong.api.service.IUserService;
import com.zhong.api.Do.UserDo;
import com.zhong.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
@com.alibaba.dubbo.config.annotation.Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDo getUser(String id) {
        System.out.println("dubbo服务接收到消费者请求...");
        return userMapper.getUser(id);
    }
}
