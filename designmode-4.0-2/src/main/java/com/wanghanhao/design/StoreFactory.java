package com.wanghanhao.design;

import com.wanghanhao.design.impl.CardCommodityService;
import com.wanghanhao.design.impl.CouponCommodityService;
import com.wanghanhao.design.impl.GoodsCommodityService;

/**
 * @author wanghanhao
 * @version 1.0
 * @description:
 * @date 2024/7/6 0:22
 */
public class StoreFactory {
    /**
     * 奖品类型方式实例化
     * @param commodityType 奖品类型
     * @return              实例化对象
     */
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的奖品服务类型");
    }

    /**
     * 奖品类信息方式实例化
     * @param clazz 奖品类
     * @return      实例化对象
     */
    public ICommodity getCommodityService(Class<? extends ICommodity> clazz) throws IllegalAccessException, InstantiationException {
        if (null == clazz) return null;
        return clazz.newInstance();
    }
}
