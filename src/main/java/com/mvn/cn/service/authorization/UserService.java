package com.mvn.cn.service.authorization;


import com.mvn.cn.entity.authorization.Role;
import com.mvn.cn.entity.authorization.User;

import java.util.List;

/**
 * Created by liKun on 2018/1/12 0012.
 */
public interface UserService {
    List<User> getAllUsers();
    User getUserById(String id);
    List<Role> getRolesById(String id);

}
