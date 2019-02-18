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
public class SmartPersion implements PersionBuilder {
    @Override
    public void setHead() {
        System.out.println("高智商");
    }

    @Override
    public void setBody() {
        System.out.println("中等身材");
    }

    @Override
    public void height() {
        System.out.println("170");
    }
}
