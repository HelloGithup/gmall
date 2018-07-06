package com.qishuiqing.gmall.service.usermanage;

import com.qishuiqing.gmall.bean.manage.basic.BaseAttrInfo;
import com.qishuiqing.gmall.bean.manage.basic.BaseCatalog1;
import com.qishuiqing.gmall.bean.manage.basic.BaseCatalog2;
import com.qishuiqing.gmall.bean.manage.basic.BaseCatalog3;
import com.qishuiqing.gmall.bean.manage.spu.BaseSaleAttr;
import com.qishuiqing.gmall.bean.manage.spu.SpuImage;
import com.qishuiqing.gmall.bean.manage.spu.SpuInfo;
import com.qishuiqing.gmall.bean.manage.spu.SpuSaleAttr;

import java.util.List;

/**
 * Created by Administrator on 2018/7/3 0003.
 */
public interface ManageService {
    List<BaseCatalog1> getCatalog1();

    List<BaseCatalog2> getCatalog2(String catalog1Id);

    List<BaseCatalog3> getCatalog3(String catalog2Id);

    List<BaseAttrInfo> getAttrList(String catalog3Id);

    BaseAttrInfo getAttrInfo(String id);

    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

    void saveSpuInfo(SpuInfo spuInfo);

    List<BaseSaleAttr> getBaseSaleList();

    List<SpuImage> getSpuImageList(String spuId);

    List<SpuSaleAttr> getSpuSaleAttrList(String spuId);
}
