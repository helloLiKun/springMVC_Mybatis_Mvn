package com.mvn.cn.controller;

import com.mvn.cn.entity.User;
import com.mvn.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by liKun on 2018/1/11 0011.
 */
@Controller
public class UserController {
    @RequestMapping("/user")
    public String user(){
        List<User> list=userService.getAllUsers();
        for(User u:list){
            System.out.println("------------"+u.getName());
        }
        return "hello";
    }

    @Autowired
    UserService userService;
}
