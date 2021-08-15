package com.trial.sc.webapi.controller;


import com.trial.sc.common.entity.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class LoginController {

    @GetMapping("/login")
    public CommonResult login(@RequestParam("username") String username,
                               @RequestParam("password") String password) {
        log.info("login username is {} password is {}", username, password);
        return new CommonResult();
    }

    @GetMapping("/getUserOrder/{sequenceNo}")
    public CommonResult getUserOrder(@PathVariable("sequenceNo") int sequenceNo) {
        log.info("getUserOrder sequenceNo is {}", sequenceNo);
        return new CommonResult();
    }
}
