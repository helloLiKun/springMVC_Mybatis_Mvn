package com.mvn.cn.service.authorization.impl;

import com.mvn.cn.entity.authorization.*;
import com.mvn.cn.mapper.authorization.RoleMapper;
import com.mvn.cn.mapper.authorization.UserMapper;
import com.mvn.cn.mapper.authorization.UserRoleMapper;
import com.mvn.cn.service.authorization.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public User getUserByName(String name) {
        UserExample userExample=new UserExample();
        UserExample.Criteria c=userExample.createCriteria();
        c.andNameEqualTo(name);
        List<User> list=userMapper.selectByExample(userExample);
        if(list!=null && list.size()>0){
            return list.get(0);
        }
        return null;
    }


    public List<Role> getRolesById(String id) {
        List<Role> roles=new ArrayList<Role>();
        UserRoleExample userRoleExample=new UserRoleExample();
        UserRoleExample.Criteria c=userRoleExample.createCriteria();
        c.andUserIdEqualTo(id);
        List<UserRole> list=userRoleMapper.selectByExample(userRoleExample);
        if(list!=null && list.size()>0){
            for(UserRole ur:list){
                Role role=roleMapper.selectByPrimaryKey(ur.getRoleId());
                if(role!=null){
                    roles.add(role);
                }
            }
        }
        return roles;
    }


    @Autowired
    UserMapper userMapper;

    @Autowired
    UserRoleMapper userRoleMapper;

    @Autowired
    RoleMapper roleMapper;

}
