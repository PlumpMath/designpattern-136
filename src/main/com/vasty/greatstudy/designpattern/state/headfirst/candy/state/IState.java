package com.vasty.greatstudy.designpattern.state.headfirst.candy.state;

/**
 * 状态接口
 * Created by ZhuangYanHao on 2016/1/26.
 */
interface IState {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
