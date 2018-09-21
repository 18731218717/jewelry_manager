package org.bdyy.jewelry.controller;

import org.bdyy.jewelry.pojo.*;
import org.bdyy.jewelry.service.LoginService;
import org.bdyy.jewelry.service.PageLoaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PageLoaderController {
    @Autowired
    PageLoaderService pageLoaderService;

    @RequestMapping(value = "/pageLoaderController.do")
    @ResponseBody
    public Msg getPageInfomation() {
        List<FinishedProductType> finishedProductType = pageLoaderService.finishedProductType();
        List<FinishedProductBroadHeading> finishedProductBroadHeading = pageLoaderService.finishedProductBroadHeading();
        List<FinishedProductSubclass> finishedProductSubclass = pageLoaderService.finishedProductSubclass();
        List<FinishedProductDiscern> finishedProductDiscern = pageLoaderService.finishedProductDiscern();
        List<Unit> unit = pageLoaderService.unit();
        List<Texture> texture = pageLoaderService.texture();
        List<Currency> currency = pageLoaderService.currency();
        return Msg.success().add("finishedProductType", finishedProductType).add("finishedProductBroadHeading", finishedProductBroadHeading).add("finishedProductSubclass", finishedProductSubclass)
                .add("finishedProductDiscern", finishedProductDiscern).add("unit", unit).add("texture", texture).add("currency", currency);
    }

}


