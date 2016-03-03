package com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.duck;


import com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.impl.FlyWithWings;
import com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.impl.QuackGuagua;

/**
 * 红色头的鸭子
 * Created by ZhuangYanHao on 2016/1/6.
 */
class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackGuagua();
    }
    
    @Override
    public void display() {
        //红头鸭
    }
}
