package com.java.design.model.factory.method;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/15 14:22
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class BenChiFactory implements CarFactory {

    BenChiFactory(){
        System.out.println("奔驰生产工厂");
    }

    @Override
    public Car createFactory() {
        return new BenChi();
    }
}
