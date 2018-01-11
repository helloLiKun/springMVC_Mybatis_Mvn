package user;

import com.mvn.cn.entity.User;
import com.mvn.cn.entity.UserExample;
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
    public void testUserService(){
        UserMapper userMapper=ctx.getBean("userMapper",UserMapper.class);
        UserExample userExample=new UserExample();
        List<User> list=userMapper.selectByExample(userExample);
        System.out.println(list.size());
    }


}
