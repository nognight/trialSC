package com.trial.sc.usercenter.controller;

import com.trial.sc.common.entity.UserInfo;
import com.trial.sc.usercenter.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/info/get")
    public UserInfo getUserInfoByUsername(@RequestBody UserInfo userInfo){
        log.info("getUserInfoByUsername {}" , userInfo.toString());
        userService.getUserInfoByUsername(userInfo);
        return userInfo;
    }
}
