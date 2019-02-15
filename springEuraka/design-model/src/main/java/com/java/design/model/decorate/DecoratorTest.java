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
public class DecoratorTest {

    public static void main(String []arg){
        Persion persion = new Persion("tom");
        Persion component = new Persion();
        ConceteDecoratorA conceteDecoratorA = new ConceteDecoratorA();
        ConcrateDecoratorB concrateDecoratorB = new ConcrateDecoratorB();
        conceteDecoratorA.setPersion(persion);
        concrateDecoratorB.setPersion(conceteDecoratorA);
        concrateDecoratorB.show();
    }

}
