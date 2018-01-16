package com.mvn.cn.util;

import java.util.UUID;

/**
 * Created by liKun on 2018/1/16 0016.
 */
public class UuId {
    public static String getId(){
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args){
        System.out.println(getId());
    }
}
