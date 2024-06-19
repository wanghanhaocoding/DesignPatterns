package com.wanghanhao.design.impl;

import com.wanghanhao.design.IVideoUserService;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 访客用户
 * @date 2024/6/19 23:37
 */
public class GuestVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("访客用户，视频480P高清");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户，视频有广告");
    }
}
