package com.wanghanhao.design;


import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @author wanghanhao
 * @version 1.0
 * @description:
 * @date 2024/7/4 23:08
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);


    @Test
    public void test_awardToUser(){
        PrizeController prizeController = new PrizeController();

        System.out.println("\r\n模拟发放优惠券测试\r\n");
        //模拟发放优惠券测试
        AwardReq req01 = new AwardReq();
        req01.setuId("10001");
        req01.setAwardType(1);
        req01.setAwardNumber("EGM1023938910232121323432");
        req01.setBizId("791098764902132");
        AwardRes awardRes01 = prizeController.awardToUser(req01);

        logger.info("请求参数:{}", JSON.toJSON(req01));
        logger.info("测试结果:{}",JSON.toJSON(awardRes01));

        System.out.println("\r\n模拟方法实物商品\r\n");
        //模拟方法实物商品
        AwardReq req02 = new AwardReq();
        req02.setuId("10001");
        req02.setAwardType(2);
        req02.setAwardNumber("9820198721311");
        req02.setBizId("1023000020112221113");
        req02.setExtMap(new HashMap<String,String>(){{
            put("consigneeUserName","谢飞机");
            put("consigneeUserPhone","15512995169");
            put("consigneeUserAddress","河北省衡水市xx县");
        }});

        AwardRes awardRes02 = prizeController.awardToUser(req02);
        logger.info("请求参数:{}",JSON.toJSON(req02));
        logger.info("测试结果:{}",JSON.toJSON(awardRes02));

        System.out.println("\r\n第三方兑换卡(爱奇艺)\r\n");
        AwardReq req03 = new AwardReq();
        req03.setuId("10001");
        req03.setAwardType(3);
        req03.setAwardNumber("hjkngvvhbnjmk");

        AwardRes awardRes03 = prizeController.awardToUser(req03);
        logger.info("请求参数:{}",JSON.toJSON(req03));
        logger.info("测试结果:{}",JSON.toJSON(awardRes03));

    }
}
