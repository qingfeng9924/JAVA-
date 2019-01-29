package com.spring.ci.euraka.Test;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/1/28 9:41
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class PublicMain {
    public static void main(String []args){
        new PublicMain().testAop();
    }

    @Test
    public void testAop(){
        System.out.println("I am Main Method");
    }
}
