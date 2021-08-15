package com.trial.sc.usercenter.service;

import com.trial.sc.common.entity.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    public UserInfo getUserInfoByUsername(UserInfo userInfo) {
        log.info("getUserInfoByUsername {}",userInfo.toString());
        userInfo.setUid(777);
        return userInfo;
    }

}
