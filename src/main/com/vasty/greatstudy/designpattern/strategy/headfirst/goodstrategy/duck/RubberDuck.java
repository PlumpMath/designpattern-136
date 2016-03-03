package com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.duck;


import com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.impl.FlyNoWay;
import com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.impl.QuackZhizhi;

/**
 * 橡皮鸭， 在第二个阶段成为隐患
 * Created by ZhuangYanHao on 2016/1/6.
 */
class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackZhizhi();
    }

    @Override
    public void display() {
        //橡皮鸭
    }
}
