package org.bdyy.jewelry.controller;

import org.bdyy.jewelry.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class PageController {

    @Resource
    private UserService userService;

    @RequestMapping("/stock_finished_product.do")
    public String stockFinishedProduct(HttpServletRequest request, HttpServletResponse response) {
        return "stock_finished_product";
    }

    @RequestMapping("/stock_materials.do")
    public String stockMaterials(HttpServletRequest request, HttpServletResponse response) {
        return "stock_materials";
    }

    @RequestMapping("/enter_finished_product.do")
    public String enterFinishedProduct(HttpServletRequest request, HttpServletResponse response) {
        return "enter_finished_product";
    }

    @RequestMapping("/enter_materials.do")
    public String enterMaterials(HttpServletRequest request, HttpServletResponse response) {
        return "enter_materials";
    }
}