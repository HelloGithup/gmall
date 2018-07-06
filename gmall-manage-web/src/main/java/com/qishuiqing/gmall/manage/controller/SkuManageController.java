package com.qishuiqing.gmall.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/7/6 0006.
 */

@Controller
public class SkuManageController {

    @PostMapping("saveSku")
    @ResponseBody
    public String saveSku(){

        return  "success";
    }

}
