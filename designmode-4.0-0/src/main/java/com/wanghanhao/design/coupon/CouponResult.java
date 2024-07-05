package com.wanghanhao.design.coupon;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 优惠券返回结果类
 * @date 2024/7/3 22:51
 */
public class CouponResult {

    private String code;//编码

    private String info;//描述

    public CouponResult(String code, String info) {
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
