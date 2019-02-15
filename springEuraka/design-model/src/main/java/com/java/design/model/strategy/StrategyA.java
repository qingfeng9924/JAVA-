package com.java.design.model.strategy;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/14 16:53
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class StrategyA implements Strategy {

    /**
     * 打7折
     */
    @Override
    public Float strategy(Float price) {
        System.out.println("StrategyA");
        return price * 0.7f;
    }
}
