package com.java.design.model.builder;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/18 16:39
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class ThinPersion implements PersionBuilder {
    @Override
    public void setHead() {
        System.out.println("大头");
    }

    @Override
    public void setBody() {
        System.out.println("瘦弱");
    }

    @Override
    public void height() {
        System.out.println("166");
    }
}
