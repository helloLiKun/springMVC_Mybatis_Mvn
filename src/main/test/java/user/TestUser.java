package user;

import com.mvn.cn.dao.UserDao;
import com.mvn.cn.entity.PermissionTree;
import com.mvn.cn.entity.PermissionTreeExample;
import com.mvn.cn.entity.User;
import com.mvn.cn.entity.UserExample;
import com.mvn.cn.mapper.PermissionTreeMapper;
import com.mvn.cn.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by liKun on 2018/1/11 0011.
 */
public class TestUser {
    ApplicationContext ctx=null;
    @Before
    public void init(){
        String cfg = "applicationContext.xml";
        ctx = new ClassPathXmlApplicationContext(cfg);
    }

    @Test
    public void testUser(){
        //方式一：通过MapperScannerConfigurer扫描接口
        UserMapper userMapper=ctx.getBean("userMapper",UserMapper.class);
        UserExample userExample=new UserExample();
        List<User> list=userMapper.selectByExample(userExample);

        //方式二：通过注入SqlSessionTemplate
//        UserDao userDao=ctx.getBean("userDao",UserDao.class);
//        UserExample userExample=new UserExample();
//        List<User> list=userDao.selectByExample(userExample);

        System.out.println(list.size());
    }

//    @Test
//    public void testPermissionTree(){
//        PermissionTreeMapper permissionTreeMapper=ctx.getBean("permissionTreeMapper",PermissionTreeMapper.class);
//        PermissionTreeExample permissionTreeExample=new PermissionTreeExample();
//        List<PermissionTree> permissionTrees=permissionTreeMapper.selectByExample(permissionTreeExample);
//        System.out.println(permissionTrees.size());
//    }

}
