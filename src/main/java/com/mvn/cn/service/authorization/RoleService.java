package com.mvn.cn.service.authorization;

import com.mvn.cn.entity.authorization.Permission;
import com.mvn.cn.entity.authorization.Role;
import com.mvn.cn.entity.authorization.User;

import java.util.List;

/**
 * Created by liKun on 2018/1/12 0012.
 */
public interface RoleService {
    List<Role> getAllRoles();
    Role getRoleById(String id);
    List<Permission> getPermissionsById(String id);
}
