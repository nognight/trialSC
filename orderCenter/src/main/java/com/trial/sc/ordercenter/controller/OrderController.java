package com.trial.sc.ordercenter.controller;

import com.trial.sc.common.entity.OrderInfo;
import com.trial.sc.ordercenter.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/info/get")
    public OrderInfo getOrderInfo(@RequestBody OrderInfo orderInfo){
       log.info("getOrderInfo {}",orderInfo.toString());
        return orderService.getOrderInfo(orderInfo);
    }
    @PostMapping("/info-list/get")
    public List<OrderInfo> getOrderInfoList(@RequestBody OrderInfo orderInfo){
        log.info("getOrderInfo {}",orderInfo.toString());
        return orderService.getOrderInfoList(orderInfo);
    }
    @PostMapping("/info/create")
    public OrderInfo createOrderInfo(@RequestBody OrderInfo orderInfo){
        log.info("createOrderInfo {}",orderInfo.toString());
        return orderService.createOrderInfo(orderInfo);
    }

    @PostMapping("/info/update")
    public OrderInfo updateOrderInfo(@RequestBody OrderInfo orderInfo){
        log.info("createOrderInfo {}",orderInfo.toString());
        return orderService.updateOrderInfo(orderInfo);
    }

}
