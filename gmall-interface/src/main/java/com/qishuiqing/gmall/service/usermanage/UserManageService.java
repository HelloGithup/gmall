package com.qishuiqing.gmall.service.usermanage;

import com.qishuiqing.gmall.bean.usermanage.UserAddress;
import com.qishuiqing.gmall.bean.usermanage.UserInfo;

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
