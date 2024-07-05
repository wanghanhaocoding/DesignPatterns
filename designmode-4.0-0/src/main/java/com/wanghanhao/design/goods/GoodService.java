package com.wanghanhao.design.goods;

import com.alibaba.fastjson.JSON;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 模拟实物商品服务
 * @date 2024/7/3 23:01
 */
public class GoodService {

    public Boolean deliverGoods(DeliverReq req){
        System.out.println("模拟发货实物商品一个："+ JSON.toJSONString(req));
        return true;
    }
}
