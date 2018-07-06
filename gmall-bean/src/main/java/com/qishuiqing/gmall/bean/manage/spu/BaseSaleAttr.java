package com.qishuiqing.gmall.bean.manage.spu;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/7/5 0005.
 */
public class BaseSaleAttr implements Serializable{
    @Id
    @Column
    String id ;
    @Column
    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
