package com.trial.sc.common.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonResult {
    private int ret;
    private Object data;
    private String msg;
}
