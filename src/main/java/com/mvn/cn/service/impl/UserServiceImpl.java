package com.mvn.cn.service.impl;

import com.mvn.cn.entity.User;
import com.mvn.cn.entity.UserExample;
import com.mvn.cn.mapper.UserMapper;
import com.mvn.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liKun on 2018/1/12 0012.
 */
@Service
public class UserServiceImpl implements UserService {
    public List<User> getAllUsers() {
        UserExample userExample=new UserExample();
        return userMapper.selectByExample(userExample);
    }

    @Autowired
    UserMapper userMapper;
}
