package com.trial.sc.ordercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderCenterApplication.class, args);
    }

}
