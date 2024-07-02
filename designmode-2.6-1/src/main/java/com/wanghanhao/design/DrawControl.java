package com.wanghanhao.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 抽奖控制
 * @date 2024/7/2 22:41
 */
public class DrawControl {

    private IDraw draw;

    public List<BetUser> doDraw(IDraw draw,List<BetUser> betUserList,int count){
        return draw.prize(betUserList,count);
    }
}
