package com.qishuiqing.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qishuiqing.gmall.bean.manage.spu.BaseSaleAttr;
import com.qishuiqing.gmall.bean.manage.spu.SpuImage;
import com.qishuiqing.gmall.bean.manage.spu.SpuInfo;
import com.qishuiqing.gmall.bean.manage.spu.SpuSaleAttr;
import com.qishuiqing.gmall.service.usermanage.ManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/4 0004.
 */
@Controller
public class SpuManageController {

    @Reference
    ManageService manageService;

    @RequestMapping("spuListPage")
    public String getSpuListPage(){
        return "spuListPage";
    }

    @RequestMapping("spuList")
    @ResponseBody
    public List<SpuInfo> getSpuInfoList(@RequestParam Map<String,String> map){
        String catalog3Id = map.get("catalog3Id");
        SpuInfo spuInfo =new SpuInfo();
        spuInfo.setCatalog3Id(catalog3Id);
        List<SpuInfo> spuInfoList = manageService.getSpuInfoList(spuInfo);
        return spuInfoList;

    }

    @PostMapping("saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(SpuInfo spuInfo){
        manageService.saveSpuInfo(spuInfo);
        return  "success";
    }

    @PostMapping("baseSaleAttrList")
    @ResponseBody
    public List<BaseSaleAttr> getBaseSaleAttrList(){
        return manageService.getBaseSaleList();
    }

    @GetMapping("spuImageList")
    @ResponseBody
    public List<SpuImage> getSpuImageList(String spuId){
        return manageService.getSpuImageList(spuId);
    }

    @GetMapping("spuSaleAttrList")
    @ResponseBody
    public List<SpuSaleAttr> getSpuSaleAttrList(String spuId){
        return manageService.getSpuSaleAttrList(spuId);
    }

}
