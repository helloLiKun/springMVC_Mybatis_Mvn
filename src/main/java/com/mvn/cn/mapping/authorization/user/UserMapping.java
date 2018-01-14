package com.mvn.cn.mapping.authorization.user;

import com.mvn.cn.mapping.authorization.AuthBase;

/**
 * Created by Administrator on 2018/1/14 0014.
 */
public interface UserMapping  extends AuthBase {
    String USERBASE=AUTHBASE+"/user";
    String TOLOGIN=USERBASE+"/toLogin";
    String LOGIN=USERBASE+"/login";

}
