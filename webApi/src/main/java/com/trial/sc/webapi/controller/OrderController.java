package com.trial.sc.webapi.controller;

import com.trial.sc.common.constant.MessageConstant;
import com.trial.sc.common.entity.CommonResult;
import com.trial.sc.common.entity.OrderInfo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {
    @Value("${center-config.order-center.url}")
    private String orderCenterUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/infos/{sequenceNo}")
    public CommonResult getOrderInfo(@PathVariable("sequenceNo") String sequenceNo) {
        log.info("getOrderInfo sequenceNo is {}", sequenceNo);

        OrderInfo orderInfo = restTemplate.postForObject(orderCenterUrl+"/order/info/get", new OrderInfo(null, null, sequenceNo), OrderInfo.class);
        return new CommonResult(0, orderInfo, MessageConstant.OK);
    }
    @GetMapping("/infos")
    public CommonResult getOrderList() {
        log.info("getOrderList uid is {}", 777);

        List<OrderInfo> orderInfos = restTemplate.postForObject(orderCenterUrl+"/order/info-list/get", new OrderInfo(null, 777, null), ArrayList.class);
        return new CommonResult(0, orderInfos, MessageConstant.OK);
    }

}
