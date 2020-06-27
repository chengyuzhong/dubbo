package com.zhong.api.service;

import com.zhong.api.Do.OrderDo;

public interface IOrderService {

    OrderDo getByOrderNo(String id);

}
