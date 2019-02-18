package com.java.design.model.template.method;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/15 16:34
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class TemplateTest {

    public static void main(String []args){
        Template user1 = new User1();
        user1.test1();
        user1.test2();

        Template user2 = new User2();
        user2.test1();
        user2.test2();
    }

}
