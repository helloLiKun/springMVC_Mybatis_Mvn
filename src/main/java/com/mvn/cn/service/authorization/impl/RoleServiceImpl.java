package com.mvn.cn.service.authorization.impl;

import com.mvn.cn.entity.authorization.Permission;
import com.mvn.cn.entity.authorization.Role;
import com.mvn.cn.entity.authorization.RoleExample;
import com.mvn.cn.mapper.authorization.PermissionMapper;
import com.mvn.cn.mapper.authorization.RoleMapper;
import com.mvn.cn.mapper.authorization.RolePermissionMapper;
import com.mvn.cn.service.authorization.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by liKun on 2018/1/12 0012.
 */
public class RoleServiceImpl implements RoleService {
    public List<Role> getAllRoles() {
        RoleExample roleExample=new RoleExample();
        return roleMapper.selectByExample(roleExample);
    }

    public Role getRoleById(String id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    public List<Permission> getPermissionsById(String id) {
        return null;
    }

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    RolePermissionMapper rolePermissionMapper;

    @Autowired
    PermissionMapper permissionMapper;
}
