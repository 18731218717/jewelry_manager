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

    @RequestMapping("/login")
    public String  login(HttpServletRequest req, Model model, HttpSession session){
            String userName = req.getParameter("username");
            String pws = req.getParameter("password");

            boolean res = loginService.login(userName,pws);

            if(res==true){
                try {
                    if (session.getAttribute("user") != null){
                        model.addAttribute("result",res);

                        return  "choose_model";
                    }else {
                        session.setAttribute("user",userName);
                        model.addAttribute("result",res);
                        return  "choose_model";
                    }
                }catch (Exception e){
                    return "redirect:../login.jsp";
                }


            }else {
                return "redirect:../login.jsp";
            }

    }

    @RequestMapping("/")
    public String ToLogin(HttpSession session,Model model){

       boolean res = false;
        try{
            if(session.getAttribute("user") != null){
                session.removeAttribute("user");
                session.invalidate();
                res = true;
            }
        }catch (Exception e){
                res = false;
        }
        model.addAttribute("result",res);
        return "login";
    }
}
