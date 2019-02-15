package com.java.design.model.factory.method;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/15 14:23
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class FactoryMethodTest {
    public static void main(String []args){
        CarFactory carFactory = new BMWFactory();
        carFactory.createFactory();
    }
}
