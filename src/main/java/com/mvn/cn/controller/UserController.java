package com.mvn.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liKun on 2018/1/11 0011.
 */
@Controller
public class UserController {
    @RequestMapping("/user")
    public String user(){
        return "hello";
    }
}
