package com.java.design.model.strategy;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/14 16:55
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class StrategyB implements Strategy {

    /**
     * 满200减50
     *
     * @param price
     * @return
     */
    @Override
    public Float strategy(Float price) {
        System.out.println("strategyB");
        if(price > 50.0f){
            return price - 50;
        }
        return price;
    }
}
