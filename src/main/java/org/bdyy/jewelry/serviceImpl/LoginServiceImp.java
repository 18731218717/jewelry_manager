package org.bdyy.jewelry.serviceImpl;

import org.bdyy.jewelry.dao.UserMapper;
import org.bdyy.jewelry.pojo.User;
import org.bdyy.jewelry.pojo.UserExample;
import org.bdyy.jewelry.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LoginServiceImp implements LoginService {

    @Autowired
    public UserMapper userMapper;

    @Override
    public boolean login(final String userName, final String password) {
        try {
            UserExample userExample = new UserExample();
            userExample.createCriteria().andUserNameEqualTo(userName);
            List<User> users = userMapper.selectByExample(userExample);

           Long c = users.stream().filter((e) -> e.getUserName().equals(userName))
                    .count();

           if (c >0){
               return true;
           }
           else {
               return false;
           }

        }catch (Exception e){
            return false;
        }
    }

}
