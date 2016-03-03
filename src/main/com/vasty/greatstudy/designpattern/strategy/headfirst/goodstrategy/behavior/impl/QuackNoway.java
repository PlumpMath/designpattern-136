package com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.impl;

import com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.IQuackBehavior;

/**
 * 不会叫
 * Created by ZhuangYanHao on 2016/1/6.
 */
public class QuackNoway implements IQuackBehavior {

    @Override
    public void quack() {
        //不会叫
    }
}
