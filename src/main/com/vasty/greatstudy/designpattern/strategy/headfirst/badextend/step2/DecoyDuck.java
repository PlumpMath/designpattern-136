package com.vasty.greatstudy.designpattern.strategy.headfirst.badextend.step2;

/**
 * 以后又多了一个诱饵鸭， 不会飞也不会叫
 * Created by ZhuangYanHao on 2016/1/6.
 */
class DecoyDuck extends Duck{

    @Override
    public void display() {
        //诱饵鸭
    }

    @Override
    public void quack() {
    }

    @Override
    public void fly() {
    }
}
