package com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.impl;

import com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.IFlyBehavior;

/**
 * 不会飞的行为
 * Created by ZhuangYanHao on 2016/1/6.
 */
public class FlyNoWay implements IFlyBehavior{

    @Override
    public void fly() {
        //不会飞
    }
}
