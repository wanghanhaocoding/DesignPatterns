package com.wanghanhao.design.impl;

import com.wanghanhao.design.IVideoUserService;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: VIP用户
 * @date 2024/6/19 23:41
 */
public class VipVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("VIP用户，视频1080P蓝光");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP用户，视频无广告");
    }
}
