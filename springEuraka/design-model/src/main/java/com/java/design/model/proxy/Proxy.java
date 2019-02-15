package com.java.design.model.proxy;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/15 11:44
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class Proxy extends Opration{

    Proxyed proxyed;
    Proxy(){
        this.proxyed = new Proxyed();
    }

    public void say(){
        this.proxyed.say();
    }

    public void hit(){
        this.proxyed.hit();
    }

}
