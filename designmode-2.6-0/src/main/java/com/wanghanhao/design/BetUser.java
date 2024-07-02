package com.wanghanhao.design;

/**
 * @author wanghanhao
 * @version 1.0
 * @description: 投注用户
 * @date 2024/7/2 22:39
 */
public class BetUser {

    private String userName;//用户姓名

    private int userWeight;//用户权重

    public BetUser(String userName, int userWeight) {
        this.userName = userName;
        this.userWeight = userWeight;
    }

    public BetUser() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }
}
