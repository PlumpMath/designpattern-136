package com.vasty.greatstudy.designpattern.strategy.headfirst.badinterface;


/**
 * 绿色头的鸭子
 * Created by ZhuangYanHao on 2016/1/6.
 */
class GreenHeadDuck extends Duck implements IFlyable, IQuackable {

    @Override
    public void display() {
    }

    @Override
    public void fly() {
        //绿头鸭的飞
    }

    @Override
    public void quack() {
        //绿头鸭的叫
    }
}
