package com.wanghanhao.design;

/**
 * @author wanghanhao
 * @version 1.0
 * @description:
 * @date 2024/6/29 18:15
 */
public class HeroHouYi implements ISkill {
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

    @Override
    public void doVertigo() {
        //无此技能的实现
    }
}
