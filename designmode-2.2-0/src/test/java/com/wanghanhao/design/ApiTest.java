package com.wanghanhao.design;

import com.wanghanhao.design.impl.CalculationAreaExt;
import org.junit.Test;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 功能测试
 * @date 2024/6/23 21:17
 */
public class ApiTest {
    @Test
    public void test_CalculationAreaExt(){
        ICalculationArea area = new CalculationAreaExt();
        double circular = area.circular(10);
        System.out.println(circular);
    }

}
