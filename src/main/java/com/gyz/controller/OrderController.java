package com.gyz.controller;

import com.gyz.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 描述：订单控制器
 * @author: youzhi.gao@ikang.com
 * @date: 2020-03-09 13:54
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/getOrderById/{id}")
    public String getOrderById(@PathVariable() Long id){
        String result = orderService.getOrderById(id);
        return result;
    }
}
