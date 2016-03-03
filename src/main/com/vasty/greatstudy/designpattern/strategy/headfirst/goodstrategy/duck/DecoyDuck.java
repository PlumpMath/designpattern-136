package com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.duck;

import com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.impl.FlyNoWay;
import com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.impl.QuackNoway;

/**
 * 以后又多了一个诱饵鸭， 不会飞也不会叫
 * Created by ZhuangYanHao on 2016/1/6.
 */
class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new QuackNoway();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        //诱饵鸭
    }
}
