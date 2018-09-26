package org.bdyy.jewelry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class EnterFinishedProductController {
    @RequestMapping(value = "/enterFinishedProductController.do")
    @ResponseBody
    public void addFinishedProduct(HttpServletRequest request) {
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
/*      String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");
        String selectFinishedProductType = request.getParameter("select-finishedProductType");*/
        System.out.println("进入表单提交控制器,取得结果:" + selectFinishedProductType);
    }
}
