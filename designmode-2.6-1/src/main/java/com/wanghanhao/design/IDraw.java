package com.wanghanhao.design;

import java.util.List;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 抽奖接口
 * @date 2024/7/2 23:00
 */
public interface IDraw {

    List<BetUser> prize(List<BetUser> list,int count);
}
