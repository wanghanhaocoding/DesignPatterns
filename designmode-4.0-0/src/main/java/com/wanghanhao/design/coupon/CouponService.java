package com.wanghanhao.design.coupon;

/**
 * @author wanghanhao
 * @version 1.0
 * @description:模拟优惠券服务
 * @date 2024/7/3 22:53
 */
public class CouponService {

    public CouponResult sendCoupon(String uId,String couponNumber,String uuid){
        System.out.println("模拟发放优惠券一张："+ uId +","+couponNumber+","+uuid);
        return new CouponResult("0000","发放成功");
    }
}
