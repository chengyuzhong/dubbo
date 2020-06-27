package com.zhong.api.Do;

import java.io.Serializable;

public class OrderDo implements Serializable {
    private String id;

    private String orderNo;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
