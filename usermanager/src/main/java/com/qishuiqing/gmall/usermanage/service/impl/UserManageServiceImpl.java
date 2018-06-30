package com.qishuiqing.gmall.usermanage.service.impl;

import com.qishuiqing.gmall.usermanage.bean.UserInfo;
import com.qishuiqing.gmall.usermanage.mapper.UserInfoMapper;
import com.qishuiqing.gmall.usermanage.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/6/30 0030.
 */
@Service
public class UserManageServiceImpl implements UserManageService{

    @Autowired
    UserInfoMapper mapper;

    @Override
    public UserInfo getUserInfo(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
