package com.trial.sc.common.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserInfo {
    private Integer uid;
    private String username;
    private String password;
}
