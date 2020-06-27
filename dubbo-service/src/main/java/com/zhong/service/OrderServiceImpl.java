package com.zhong.service;

import com.zhong.api.Do.OrderDo;
import com.zhong.api.service.IOrderService;
import org.springframework.stereotype.Service;

@Service("orderService")
@com.alibaba.dubbo.config.annotation.Service
public class OrderServiceImpl implements IOrderService {


    @Override
    public OrderDo getByOrderNo(String id) {
        OrderDo order = new OrderDo();
        order.setId("1");
        order.setOrderNo("000000000000");
        return order;
    }
}
