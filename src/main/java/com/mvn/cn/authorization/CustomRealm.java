package com.mvn.cn.authorization;


import com.alibaba.druid.util.StringUtils;
import com.mvn.cn.entity.authorization.Permission;
import com.mvn.cn.entity.authorization.Role;
import com.mvn.cn.entity.authorization.User;
import com.mvn.cn.service.authorization.PermissionService;
import com.mvn.cn.service.authorization.RoleService;
import com.mvn.cn.service.authorization.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by liKun on 2018/1/12 0012.
 */
public class CustomRealm extends AuthorizingRealm{
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;

    /**
     * 添加角色
     * @param username
     * @param info
     */
    private void addRole(String username, SimpleAuthorizationInfo info) {
        User user=userService.getUserByName(username);
        if(user!=null){
            List<Role> roles = userService.getRolesById(user.getId());
            if(roles!=null&&roles.size()>0){
                for (Role role : roles) {
                    info.addRole(role.getName());
                }
            }
        }

    }

    /**
     * 添加权限
     * @param username
     * @param info
     * @return
     */
    private SimpleAuthorizationInfo addPermission(String username,SimpleAuthorizationInfo info) {
        List<Permission> permissions = new ArrayList<Permission>();
        User user=userService.getUserByName(username);
        if(user!=null){
            List<Role> roles = userService.getRolesById(user.getId());
            if(roles!=null&&roles.size()>0){
                for (Role role : roles) {
                    List<Permission> list=roleService.getPermissionsById(role.getId());
                    permissions.addAll(list);
                }
            }
        }

        for (Permission permission : permissions) {
            info.addStringPermission(permission.getValue());//添加权限
        }
        return info;
    }


    /**
     * 获取授权信息
     */
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //用户名
        String username = (String) principals.getPrimaryPrincipal();
        //根据用户名来添加相应的权限和角色
        if(!StringUtils.isEmpty(username)){
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            addPermission(username,info);
            addRole(username, info);
            return info;
        }
        return null;
    }


    /**
     * 登录验证
     */
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken ) throws AuthenticationException {
        //令牌——基于用户名和密码的令牌
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        //令牌中可以取出用户名
        String accountName = token.getUsername();
        //让shiro框架去验证账号密码
        if(!StringUtils.isEmpty(accountName)){
            User user = userService.getUserByName(accountName);
            if(user != null){
                return new SimpleAuthenticationInfo(user.getName(), user.getPwd(), token.getUsername());
            }
        }

        return null;
    }


}
