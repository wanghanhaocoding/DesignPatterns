package com.wanghanhao.design;

import com.wanghanhao.design.impl.HeroHouYi;
import com.wanghanhao.design.impl.HeroLianPo;
import org.junit.Test;

/**
 * @author wanghanhao
 * @version 1.0
 * @description:
 * @date 2024/6/29 18:39
 */
public class ApiTest {

    @Test
    public void test_ISkill(){
        //后裔
        HeroHouYi heroHouYi = new HeroHouYi();
        heroHouYi.doArchery();

        //廉颇
        HeroLianPo heroLianPo = new HeroLianPo();
        heroLianPo.doInvisible();
    }
}
