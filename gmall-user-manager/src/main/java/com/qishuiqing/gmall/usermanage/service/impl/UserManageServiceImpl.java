package com.qishuiqing.gmall.usermanage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qishuiqing.gmall.bean.usermanage.UserAddress;
import com.qishuiqing.gmall.bean.usermanage.UserInfo;
import com.qishuiqing.gmall.service.usermanage.UserManageService;
import com.qishuiqing.gmall.usermanage.mapper.UserAddressMapper;
import com.qishuiqing.gmall.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by Administrator on 2018/6/30 0030.
 */
@Service
public class UserManageServiceImpl implements UserManageService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    UserAddressMapper UserAddressMapper;

    @Override
    public UserInfo getUserInfo(String id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserInfo> getUserInfo(UserInfo user) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andLike("loginName",user.getLoginName()+"%");
        return userInfoMapper.selectByExample(example);
    }

    @Override
    public List<UserInfo> getUserInfoList() {
        return userInfoMapper.selectAll();
    }

    @Override
    public int updateUser(UserInfo user) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andLike("name",user.getName()+"%");
        return userInfoMapper.updateByExampleSelective(user,example);
    }

    @Override
    public int addUser(UserInfo user) {
        return userInfoMapper.insertSelective(user);
    }

    @Override
    public int deleteUser(UserInfo user) {
        return userInfoMapper.deleteByPrimaryKey(user);
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        List<UserAddress> addressList = null;
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        addressList = UserAddressMapper.select(userAddress);
        return addressList;

    }

}
