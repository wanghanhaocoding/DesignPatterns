package com.wanghanhao.design;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 发奖结果反馈对象
 * @date 2024/7/4 22:37
 */
public class AwardRes {

    private String code;//编码

    private String info;//描述

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
