package org.bdyy.jewelry.controller;

import com.alibaba.fastjson.JSONObject;
import org.bdyy.jewelry.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageLoaderController {
    @ResponseBody
    @RequestMapping(value = "/pageLoaderController.do", produces = {"text/html;charset=UTF-8;", "application/json;charset=UTF-8;"})
    public String getPageInfomation() {
        User user = new User();
        user.setUserId(1);
        user.setUserName("郑凯");
        System.out.println("my name is 郑凯");
        user.setUserPassword("123456");
        System.out.println(JSONObject.toJSON(user).toString());
        return "郑凯";
    }
}


