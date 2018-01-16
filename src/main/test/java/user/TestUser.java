package user;

import com.mvn.cn.entity.authorization.Permission;
import com.mvn.cn.entity.authorization.User;
import com.mvn.cn.entity.authorization.UserExample;
import com.mvn.cn.mapper.authorization.PermissionMapper;
import com.mvn.cn.mapper.authorization.UserMapper;
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

    @Test
    public void testPermission(){
        Permission p=new Permission();
        p.setId("1");
        p.setName("test1");
        p.setValue("/base/authBase/user/test1");
        PermissionMapper permissionMapper=ctx.getBean("permissionMapper",PermissionMapper.class);
        permissionMapper.insert(p);

    }

}
