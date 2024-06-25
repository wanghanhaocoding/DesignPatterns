package com.wanghanhao.design.test;

import com.alibaba.fastjson.JSON;
import com.wanghanhao.design.CashCard;
import com.wanghanhao.design.CreditCard;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author wanghanhao
 * @version 1.0
 * @description:
 * @date 2024/6/24 23:06
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_CashCard(){
        CashCard cashCard = new CashCard();
        //提现
        cashCard.withdrawal("100001",new BigDecimal(100));
        //储蓄
        cashCard.recharge("100001",new BigDecimal(100));
        //交易流水
        List<String> tradeFlow = cashCard.tradeFlow();
        logger.info("查询交易流水，{}", JSON.toJSONString(tradeFlow));
    }
    @Test
    public void test_CreditCard(){
        CreditCard creditCard = new CreditCard();
        //支付
        creditCard.withdrawal("100001",new BigDecimal(100));
        //还款
        creditCard.recharge("100001",new BigDecimal(100));
        //交易流水
        List<String> tradeFlow = creditCard.tradeFlow();
        logger.info("查询交易流水，{}", JSON.toJSONString(tradeFlow));
    }

}
