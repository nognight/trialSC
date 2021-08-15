package com.trial.sc.webapi.controller;


import com.trial.sc.common.constant.MessageConstant;
import com.trial.sc.common.entity.CommonResult;
import com.trial.sc.common.entity.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@Slf4j
public class LoginController {

    @Value("${center-config.user-center.url}")
    private String userCenterUrl;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/login")
    public CommonResult login(@RequestParam("username") String username,
                              @RequestParam("password") String password) {
        log.info("login username is {} password is {}", username, password);

        UserInfo userInfo = restTemplate.postForObject(userCenterUrl+"/user/info/get", new UserInfo(null, username, password), UserInfo.class);
        return new CommonResult(0, userInfo, MessageConstant.OK);
    }
}
