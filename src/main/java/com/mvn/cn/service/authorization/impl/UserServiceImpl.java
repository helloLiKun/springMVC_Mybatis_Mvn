package com.mvn.cn.service.authorization.impl;

import com.mvn.cn.entity.authorization.Role;
import com.mvn.cn.entity.authorization.User;
import com.mvn.cn.entity.authorization.UserExample;
import com.mvn.cn.mapper.authorization.*;
import com.mvn.cn.service.authorization.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by liKun on 2018/1/12 0012.
 */
public class UserServiceImpl implements UserService {
    public List<User> getAllUsers() {
        UserExample userExample=new UserExample();
        return userMapper.selectByExample(userExample);
    }

    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }


    public List<Role> getRolesById(String id) {
        return null;
    }


    @Autowired
    UserMapper userMapper;

    @Autowired
    UserRoleMapper userRoleMapper;

    @Autowired
    RoleMapper roleMapper;

}
