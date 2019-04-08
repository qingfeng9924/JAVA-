package com.java.design.model.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/19 20:55
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public abstract class Subject {

    public List<Observe> observeList;

    Subject(){
        this.observeList = new ArrayList<>();
    }

    public void addObserve(Observe observe){
        this.observeList.add(observe);
    }
}
