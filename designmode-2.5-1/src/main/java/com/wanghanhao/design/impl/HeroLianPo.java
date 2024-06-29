package com.wanghanhao.design.impl;

import com.wanghanhao.design.ISKillVertigo;
import com.wanghanhao.design.ISkillInvisible;
import com.wanghanhao.design.ISkillSilent;

/**
 * @author wanghanhao
 * @version 1.0
 * @description:
 * @date 2024/6/29 18:36
 */
public class HeroLianPo implements ISkillInvisible, ISkillSilent, ISKillVertigo {

    @Override
    public void doVertigo() {
        System.out.println("廉颇的眩晕技能");
    }

    @Override
    public void doInvisible() {
        System.out.println("廉颇的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("廉颇的沉默技能");
    }
}
