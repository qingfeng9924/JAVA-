package com.java.design.model.strategy;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/14 17:02
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class StrategyTest {
    public static void main(String []args){
        Wood wood = new Wood(new StrategyA());
        System.out.println(wood.getPrice(70f));
    }
}
