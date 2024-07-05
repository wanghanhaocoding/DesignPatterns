package com.wanghanhao.design.card;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 模拟爱奇艺会员卡服务
 * @date 2024/7/3 22:46
 */
public class IQiYiCardService {

    public void grantToken(String bindMobileNumber,String cardId){
        System.out.println("模拟发放爱奇艺会员卡一张："+bindMobileNumber+","+cardId);
    }
}
