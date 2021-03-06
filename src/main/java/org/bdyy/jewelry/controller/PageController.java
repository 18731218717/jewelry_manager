package org.bdyy.jewelry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class PageController {
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

    @RequestMapping("/choose_model.do")
    public String chooseModel(HttpServletRequest request, HttpServletResponse response) {
        return "choose_model";
    }

    @RequestMapping("/enter_materials.do")
    public String enterMaterials(HttpServletRequest request, HttpServletResponse response) {
        return "enter_materials";
    }
}