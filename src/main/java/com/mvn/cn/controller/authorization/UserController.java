package com.mvn.cn.controller.authorization;

import com.mvn.cn.entity.authorization.User;
import com.mvn.cn.mapping.authorization.user.UserMapping;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liKun on 2018/1/12 0012.
 */
@Controller
public class UserController implements UserMapping{
    @RequestMapping(TOLOGIN)
    public String toLogin(ModelMap map){
        map.put("loginUrl",LOGIN);
        return "toLogin";
    }
    @RequestMapping(LOGIN)
    public String login(HttpServletRequest request){
        //当前Subject
        org.apache.shiro.subject.Subject currentUser = SecurityUtils.getSubject();
        //加密（md5+盐），返回一个32位的字符串小写
//        String salt="("+request.getParameter("username")+")";
//        String md5Pwd=new Md5Hash(request.getParameter("password"),salt).toString();
//        //传递token给shiro的realm
//        UsernamePasswordToken token = new UsernamePasswordToken(request.getParameter("username"),md5Pwd);
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);

        try {
            currentUser.login(token);
            User user=new User();
            user.setName(username);
            request.setAttribute("user",user);
            return "welcome";

        } catch (AuthenticationException e) {//登录失败
            request.setAttribute("msg", "用户名和密码错误");
            return "toLogin";
        }
    }

    @RequestMapping(TEST1)
    public String test1(){
        return "test1";
    }
    @RequestMapping(TEST2)
    public String test2(){
        return "test2";
    }
    @RequestMapping(TEST3)
    public String test3(){
        return "test3";
    }
}
