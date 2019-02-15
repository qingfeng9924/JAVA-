package com.java.design.model.decorate;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/15 10:18
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class ConceteDecoratorA extends Decorator {

    @Override
    public void show() {
        System.out.println("A");
        persion.show();
    }
}
