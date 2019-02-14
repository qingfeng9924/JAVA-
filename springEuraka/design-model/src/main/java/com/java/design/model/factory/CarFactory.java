package com.java.design.model.factory;

/**
 * Description:简单工厂模式
 *
 * @Author : zhangyuan
 * @Project ： springEuraka
 * @Date : 2019/2/14 15:36
 * @Email ： zhang.yuan@unisinsight.com
 * @Company :
 **/
public class CarFactory {
    public static void main(String []args){
        createCar("BWM");
    }

    public static Car createCar(String carName){
        Car car = null;
        switch (carName){
            case "BWM":
                car = new BWM();
                break;
            case "BenChi":
                car = new BenChi();
                break;
            default:break;
        }
        return car;
    }
}
