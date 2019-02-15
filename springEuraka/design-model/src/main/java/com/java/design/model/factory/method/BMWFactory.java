package com.java.design.model.factory.method;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/15 14:21
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class BMWFactory implements CarFactory {

    BMWFactory(){
        System.out.println("宝马生产工厂");
    }

    @Override
    public Car createFactory() {
        return new BWM();
    }
}
