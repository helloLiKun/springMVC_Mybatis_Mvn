package com.mvn.cn.dao;

import com.mvn.cn.entity.User;
import com.mvn.cn.entity.UserExample;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liKun on 2018/1/11 0011.
 */
@Repository
public class UserDao {
    @Resource
    SqlSessionTemplate sqlSessionTemplate;

    public List<User> selectByExample(UserExample example){
        return sqlSessionTemplate.selectList("com.mvn.cn.mapper.UserMapper.selectByExample",example);
    }

}
