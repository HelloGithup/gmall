package com.qishuiqing.gmall.manage.mapper;

import com.qishuiqing.gmall.bean.manage.spu.SpuSaleAttr;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2018/7/5 0005.
 */
public interface SpuSaleAttrMapper extends Mapper<SpuSaleAttr>{
    List<SpuSaleAttr> getSpuSaleAttrList(String spuId);
}
