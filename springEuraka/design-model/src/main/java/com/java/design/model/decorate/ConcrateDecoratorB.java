package com.java.design.model.decorate;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/15 10:19
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class ConcrateDecoratorB extends Decorator {
    @Override
    public void show() {
        System.out.println("B");
        persion.show();
    }
}
