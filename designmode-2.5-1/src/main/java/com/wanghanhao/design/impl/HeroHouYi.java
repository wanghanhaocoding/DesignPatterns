package com.wanghanhao.design.impl;

import com.wanghanhao.design.ISkillArchery;
import com.wanghanhao.design.ISkillInvisible;
import com.wanghanhao.design.ISkillSilent;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 王者英雄，后裔
 * @date 2024/6/29 18:34
 */
public class HeroHouYi implements ISkillArchery, ISkillInvisible, ISkillSilent {
    @Override
    public void doArchery() {
        System.out.println("后裔的灼日之矢");
    }

    @Override
    public void doInvisible() {
        System.out.println("后裔的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("后裔的沉默技能");
    }
}
