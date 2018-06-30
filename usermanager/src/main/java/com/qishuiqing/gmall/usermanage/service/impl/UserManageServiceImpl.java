package com.qishuiqing.gmall.usermanage.service.impl;

import com.qishuiqing.gmall.usermanage.bean.UserInfo;
import com.qishuiqing.gmall.usermanage.mapper.UserInfoMapper;
import com.qishuiqing.gmall.usermanage.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

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

    @Override
    public List<UserInfo> getUserInfo(UserInfo user) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andLike("loginName",user.getLoginName()+"%");
        return mapper.selectByExample(example);
    }

    @Override
    public List<UserInfo> getUserInfoList() {
        return mapper.selectAll();
    }

    @Override
    public int updateUser(UserInfo user) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andLike("name",user.getName()+"%");
        return mapper.updateByExampleSelective(user,example);
    }

    @Override
    public int addUser(UserInfo user) {
        return mapper.insertSelective(user);
    }

    @Override
    public int deleteUser(UserInfo user) {
        return mapper.deleteByPrimaryKey(user);
    }

}
