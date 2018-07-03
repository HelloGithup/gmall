package com.qishuiqing.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qishuiqing.gmall.bean.usermanage.UserAddress;
import com.qishuiqing.gmall.service.usermanage.UserManageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/7/2 0002.
 */
@RestController
public class OrderController {

    @Reference
    UserManageService userManageService;


    @RequestMapping("userAddress")
    public List<UserAddress> getOrder(String userId){
        List<UserAddress> userAddressList = userManageService.getUserAddressList(userId);
        return  userAddressList;
    }

}
