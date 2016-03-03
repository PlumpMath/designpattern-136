package com.vasty.greatstudy.designpattern.state.headfirst.candy.state;

/**
 * 糖果机内部没有钱的状态
 * Created by ZhuangYanHao on 2016/1/26.
 */
class NoQuarterState implements IState {

    @Override
    public void insertQuarter() {
    }

    @Override
    public void ejectQuarter() {
    }

    @Override
    public void turnCrank() {
    }

    @Override
    public void dispense() {
    }
}
