package com.gyz.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.gyz.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @description: 描述：订单服务实现类
 * @author: youzhi.gao@ikang.com
 * @date: 2020-03-09 13:53
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    @SentinelResource(value = "getOrderById")
    public String getOrderById(Long id) {
        String result = "this order is " + id;
        return result;
    }
}
