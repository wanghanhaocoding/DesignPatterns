package com.wanghanhao.design.impl;

import com.wanghanhao.design.IVideoUserService;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 普通用户
 * @date 2024/6/19 23:39
 */
public class OrdinaryVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("普通用户，视频720P超清");
    }

    @Override
    public void advertisement() {
        System.out.println("普通用户，视频有广告");
    }
}
