package com.java.design.model.builder;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/18 16:43
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class BuilderDirect {
    public PersionBuilder persionBuilder;
    public BuilderDirect(PersionBuilder persionBuilder){
        this.persionBuilder = persionBuilder;
    }

    public PersionBuilder createPersion(){
        this.persionBuilder.height();
        this.persionBuilder.setBody();
        this.persionBuilder.setHead();
        return this.persionBuilder;
    }
}
