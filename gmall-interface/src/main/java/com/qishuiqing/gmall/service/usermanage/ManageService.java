package com.qishuiqing.gmall.service.usermanage;

import com.qishuiqing.gmall.bean.manage.BaseAttrInfo;
import com.qishuiqing.gmall.bean.manage.BaseCatalog1;
import com.qishuiqing.gmall.bean.manage.BaseCatalog2;
import com.qishuiqing.gmall.bean.manage.BaseCatalog3;

import java.util.List;

/**
 * Created by Administrator on 2018/7/3 0003.
 */
public interface ManageService {
    public List<BaseCatalog1> getCatalog1();

    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    public List<BaseAttrInfo> getAttrList(String catalog3Id);

}
