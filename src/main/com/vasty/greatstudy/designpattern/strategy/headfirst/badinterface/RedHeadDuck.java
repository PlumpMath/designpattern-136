package com.vasty.greatstudy.designpattern.strategy.headfirst.badinterface;


/**
 * 红色头的鸭子
 * Created by ZhuangYanHao on 2016/1/6.
 */
class RedHeadDuck extends Duck implements IFlyable, IQuackable {
    
    @Override
    public void display() {
    }

    @Override
    public void fly() {
        //红头鸭的飞
    }

    @Override
    public void quack() {
        //红头鸭的叫
    }
}
