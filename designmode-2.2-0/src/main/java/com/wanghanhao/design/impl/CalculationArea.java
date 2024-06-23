package com.wanghanhao.design.impl;

import com.wanghanhao.design.ICalculationArea;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 面积计算
 * @date 2024/6/23 21:03
 */
public class CalculationArea implements ICalculationArea {

    private final static double π = 3.14D;
    @Override
    public double rectangle(double x, double y) {
        return x * y;
    }

    @Override
    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double circular(double r) {
        return π * r * r;
    }
}
