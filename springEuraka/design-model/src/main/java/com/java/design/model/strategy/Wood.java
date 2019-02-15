package com.java.design.model.strategy;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/14 16:59
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class Wood {

    Strategy strategy;
    Wood(Strategy strategy){
        this.strategy = strategy;
    }

    public Float getPrice(Float price){
        return this.strategy.strategy(price);
    }
}
