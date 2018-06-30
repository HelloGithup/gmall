package com.qishuiqing.gmall.usermanage.controller;

import com.qishuiqing.gmall.usermanage.bean.UserInfo;
import com.qishuiqing.gmall.usermanage.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/6/30 0030.
 */
@RestController
public class UserManagerController{

    @Autowired
    UserManageService manageService;

    @RequestMapping("user/{id}")
    public UserInfo getUserInfo(@PathVariable("id") String id){
        return manageService.getUserInfo(id);
    }

    @RequestMapping("user")
    public List<UserInfo> getUserInfo(UserInfo userInfo){
        return manageService.getUserInfo(userInfo);
    }

    @RequestMapping("users")
    public List<UserInfo> getUsers(){
        return manageService.getUserInfoList();
    }

    @RequestMapping(value = "user",method = RequestMethod.POST)
    public int addUser(UserInfo userInfo){
        return manageService.addUser(userInfo);
    }

    @RequestMapping(value = "user",method = RequestMethod.PUT)
    public int updateUser(UserInfo userInfo){
        return manageService.updateUser(userInfo);
    }

    @RequestMapping(value = "user",method = RequestMethod.DELETE)
    public int deleteUser(UserInfo userInfo){
        return manageService.deleteUser(userInfo);
    }
}
