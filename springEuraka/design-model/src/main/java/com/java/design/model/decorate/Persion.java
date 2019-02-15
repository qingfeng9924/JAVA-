package com.java.design.model.decorate;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/15 10:15
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class Persion {

    String name;

    public Persion(String name){
        this.name = name;
    }

    Persion(){

    }

    public void show(){
        System.out.println(this.name);
    }
}
