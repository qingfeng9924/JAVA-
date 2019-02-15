package com.java.design.model.decorate;

import java.util.Objects;

/**
 * Description:
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/15 10:16
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class Decorator extends Persion{

    public Persion persion;

    public void setPersion(Persion persion) {
        this.persion = persion;
    }

    @Override
    public void show() {
        persion.show();
    }
}
