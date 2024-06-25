package com.wanghanhao.design;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 银行卡
 * @date 2024/6/25 22:08
 */
public abstract class BankCard {

    private Logger logger = LoggerFactory.getLogger(BankCard.class);

    private String cardNo;//卡号

    private String cardDate;//开卡时间

    public BankCard(String cardNo,String cardDate){
        this.cardNo = cardNo;
        this.cardDate = cardDate;
    }

    //正向入账，+ 钱
    public String positive(String orderId,BigDecimal amount){
        //入款成功，存款
        logger.info("卡号{} 入款成功，单号：{} 金额：{}",cardNo,orderId,amount);
        return "0000";
    }

    //逆向入账，- 钱
    public String negative(String orderId,BigDecimal amount){
        //出款成功，存款、还款
        logger.info("卡号{} 出款成功，单号：{} 金额：{}",cardNo,orderId,amount);
        return "0000";
    }
    /**
     * 交易流水查询
     *
     * @return 交易流水
     */
    public List<String> tradeFlow(){
        logger.info("交易流水查询成功");
        List<String> tradeList = new ArrayList<>();
        tradeList.add("100001,100.00");
        tradeList.add("100001,80.00");
        tradeList.add("100001,76.50");
        tradeList.add("100001,126.00");
        return tradeList;
    }
}
