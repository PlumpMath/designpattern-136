package com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.duck;


import com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.impl.FlyWithWings;
import com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.impl.QuackGuagua;

/**
 * 绿色头的鸭子
 * Created by ZhuangYanHao on 2016/1/6.
 */
class GreenHeadDuck extends Duck {

    public GreenHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackGuagua();
    }

    @Override
    public void display() {
        //绿头鸭
    }
}
