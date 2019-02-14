package com.java.design.model.factory;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/14 15:53
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class FactoryTest {
    public static void main(String []args){
        Car car = CarFactory.createCar("BWM");
    }
}
