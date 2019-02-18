package com.java.design.model.template.method;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/15 16:31
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public abstract class Template {

    public void test1(){
        System.out.println("题目1答案" + answer1());
    }

    public abstract String answer1();

    public void test2(){
        System.out.println("题目2答案" + answer2());
    }

    public abstract String answer2();
}
