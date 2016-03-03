package com.vasty.greatstudy.designpattern.strategy.headfirst.badinterface;


/**
 * 以后又多了一个诱饵鸭， 不会飞也不会叫
 * Created by ZhuangYanHao on 2016/1/6.
 */
class DecoyDuck extends Duck {

    @Override
    public void display() {
        //诱饵鸭
    }

    //不能飞也不能叫， 不实现任何接口
}
