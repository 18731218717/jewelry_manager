package org.bdyy.jewelry.serviceImpl;

import org.bdyy.jewelry.dao.UserMapper;
import org.bdyy.jewelry.pojo.User;
import org.bdyy.jewelry.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public User selectUser(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

}