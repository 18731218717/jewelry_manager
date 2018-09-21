package org.bdyy.jewelry.controller;

import org.bdyy.jewelry.pojo.Msg;
import org.bdyy.jewelry.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageLoaderController {
    @RequestMapping(value = "/pageLoaderController.do")
    @ResponseBody
    public Msg getPageInfomation() {
        User user = new User();
        user.setUserId(1);
        user.setUserName("郑凯");
        user.setUserPassword("123456");
        System.out.println("收到一个请求,并进行回复");
        return Msg.success().add("user", user);
    }
}


