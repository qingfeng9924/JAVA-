package com.java.design.model.proxy;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/15 11:53
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class ProxyTest {
    public static void main(String []args){
        Proxy proxy = new Proxy();
        proxy.hit();
        proxy.say();
    }
}
