package org.bdyy.jewelry.test;

import org.bdyy.jewelry.dao.UserMapper;
import org.bdyy.jewelry.pojo.User;
import org.bdyy.jewelry.service.LoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LoginService loginService;
    @Test
    public void testSelectUser() throws Exception {
        int id = 1;
        User user = userMapper.selectByPrimaryKey(id);
        System.out.println(user.getUserId() + " " + user.getUserName() + " " + user.getUserPassword());
    }
}
