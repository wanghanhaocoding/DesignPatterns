package com.wanghanhao.design;

import org.junit.Test;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 单元测试
 * @date 2024/6/29 18:24
 */
public class ApiTest {

    @Test
    public void test_ISKill(){
        //后裔
        HeroHouYi heroHouYi = new HeroHouYi();
        heroHouYi.doArchery();

        //廉颇
        HeroLianPo heroLianPo = new HeroLianPo();
        heroLianPo.doInvisible();
    }
}
