package com.qishuiqing.gmall.usermanage.service;

import com.qishuiqing.gmall.usermanage.bean.UserAddress;
import com.qishuiqing.gmall.usermanage.bean.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2018/6/30 0030.
 */
public interface UserManageService {
    UserInfo getUserInfo(String id);

    List<UserInfo> getUserInfo(UserInfo user);

    List<UserInfo> getUserInfoList();

    int updateUser(UserInfo user);

    int addUser(UserInfo user);

    int deleteUser(UserInfo user);

    List<UserAddress> getUserAddressList(String userId);
}
