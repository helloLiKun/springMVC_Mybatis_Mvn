package com.mvn.cn.service.authorization;


import com.mvn.cn.entity.authorization.Role;
import com.mvn.cn.entity.authorization.User;

import java.util.List;
import java.util.Map;

/**
 * Created by liKun on 2018/1/12 0012.
 */
public interface UserService {
    List<User> getAllUsers();
    User getUserById(String id);
    User getUserByName(String name);
    List<Role> getRolesById(String id);

}
