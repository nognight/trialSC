package com.trial.sc.ordercenter.service;

import com.trial.sc.common.entity.OrderInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class OrderService {
    public OrderInfo getOrderInfo(OrderInfo orderInfo){
        orderInfo.setOid(123);
        orderInfo.setUid(123);
        return orderInfo;
    }

    public List<OrderInfo> getOrderInfoList(OrderInfo orderInfo){
        orderInfo.setOid(123);
        orderInfo.setUid(123);
        List<OrderInfo>  resultList = new ArrayList<>();
        resultList.add(orderInfo);
        return resultList;
    }

    public OrderInfo createOrderInfo(OrderInfo orderInfo){
        return orderInfo;
    }

    public OrderInfo updateOrderInfo(OrderInfo orderInfo){
        return orderInfo;
    }
}
