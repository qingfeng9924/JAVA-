package com.java.design.model.builder;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/18 16:45
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class BuilderTest {
    public static void main(String []args){
        PersionBuilder persionBuilder = new BuilderDirect(new SmartPersion()).createPersion();
    }
}
