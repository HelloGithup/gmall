package com.qishuiqing.gmall.manage.mapper;

import com.qishuiqing.gmall.bean.manage.basic.BaseAttrInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2018/7/3 0003.
 */
public interface BaseAttrInfoMapper extends Mapper<BaseAttrInfo>{
    List<BaseAttrInfo> getBaseAttrInfo(String catalog3_id);
}
