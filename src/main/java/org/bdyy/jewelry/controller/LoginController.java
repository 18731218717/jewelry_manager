package org.bdyy.jewelry.controller;

import org.bdyy.jewelry.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @ResponseBody
    @RequestMapping("/login.do")
    public String login(HttpServletRequest req, Model model, HttpSession session) {
        String userName = req.getParameter("username");
        String pws = req.getParameter("password");

        boolean res = loginService.login(userName, pws);

        if (res == true) {
            try {
                if (session.getAttribute("user") != null) {
                    model.addAttribute("result", res);
                    System.out.println("已经在线");
                    return "kkkk";          //此处应当封装一个类,这个类中应当包含一些错误提示信息,然后返回json数据,前端页面判断,进行跳转
                } else {
                    session.setAttribute("user", userName);
                    model.addAttribute("result", res);
                    System.out.println("验证成功");
                    return "kkkk";          //直接返回json,做一个标记,显示请求验证成功
                }
            } catch (Exception e) {
                System.out.println("登录异常");
                return "redirect:login.jsp";            //此处都不应当直接跳转
            }
        } else {
            System.out.println("登录失败");
            return "redirect:login.jsp";//此处都不应当直接跳转
        }

    }

    @RequestMapping("/")
    public String ToLogin(HttpSession session, Model model) {

        boolean res = false;
        try {
            if (session.getAttribute("user") != null) {
                session.removeAttribute("user");
                session.invalidate();
                res = true;
            }
        } catch (Exception e) {
            res = false;
        }
        model.addAttribute("result", res);
        System.out.println("再次登录");
        return "login";
    }
}
