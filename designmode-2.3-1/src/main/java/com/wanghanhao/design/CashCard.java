package com.wanghanhao.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 模拟储蓄卡
 * @date 2024/6/25 22:36
 */
public class CashCard extends BankCard{

    private Logger logger = LoggerFactory.getLogger(CashCard.class);

    public CashCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    /**
     * 提现
     *
     * @param orderId 单号
     * @param amount  金额
     * @return 状态码 0000成功、0001失败、0002重复
     */
    public String withdrawal(String orderId, BigDecimal amount){
        //模拟支付成功
        logger.info("提现成功，单号:{}，金额:{}",orderId,amount);
        return super.negative(orderId,amount);
    }

    /**
     * 储蓄
     *
     * @param orderId 单号
     * @param amount  金额
     */
    public String recharge(String orderId,BigDecimal amount){
        //模拟充值成功
        logger.info("储蓄成功，单号：{} 金额：{}",orderId,amount);
        return super.positive(orderId,amount);
    }

    /**
     * 风险校验
     *
     * @param cardNo 卡号
     * @param orderId 单号
     * @param amount  金额
     * @return 状态
     */
    public boolean checkRisk(String cardNo,String orderId,BigDecimal amount){
        //模拟风控校验
        logger.info("风控校验，卡号：{} 单号：{} 金额：{}",cardNo,orderId,amount);
        return true;
    }
}
