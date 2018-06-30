package com.qishuiqing.gmall.usermanage.controller;

import com.qishuiqing.gmall.usermanage.bean.UserInfo;
import com.qishuiqing.gmall.usermanage.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/30 0030.
 */
@Controller
@RestController
public class UserManagerController{

    @Autowired
    UserManageService manageService;

    @RequestMapping("user/{id}")
    public UserInfo getUserInfo(@PathVariable("id") String id){
        return manageService.getUserInfo(id);
    }

}
