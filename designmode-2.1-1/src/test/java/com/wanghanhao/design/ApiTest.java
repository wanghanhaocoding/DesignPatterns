package com.wanghanhao.design;

import com.wanghanhao.design.impl.GuestVideoUserService;
import com.wanghanhao.design.impl.OrdinaryVideoUserService;
import com.wanghanhao.design.impl.VipVideoUserService;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 测试
 * @date 2024/6/19 23:42
 */
public class ApiTest {

    public static void main(String[] args) {
        GuestVideoUserService guest = new GuestVideoUserService();
        guest.advertisement();
        guest.definition();
        OrdinaryVideoUserService ordinary = new OrdinaryVideoUserService();
        ordinary.advertisement();
        ordinary.definition();
        VipVideoUserService vip = new VipVideoUserService();
        vip.advertisement();
        vip.definition();
    }
}
