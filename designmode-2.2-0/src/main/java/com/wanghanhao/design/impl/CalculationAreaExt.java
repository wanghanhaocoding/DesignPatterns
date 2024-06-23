package com.wanghanhao.design.impl;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 扩展需求，实现自己的需求
 * @date 2024/6/23 21:12
 */
public class CalculationAreaExt extends CalculationArea{

    private final static  double π = 3.141592653D;

    @Override
    public double circular(double r) {
        return π * r * r;
    }
}
