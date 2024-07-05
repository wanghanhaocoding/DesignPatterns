package com.wanghanhao.design;

import java.util.Map;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 发放商品接口
 * @date 2024/7/5 23:58
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String,String> extMap) throws Exception;
}
