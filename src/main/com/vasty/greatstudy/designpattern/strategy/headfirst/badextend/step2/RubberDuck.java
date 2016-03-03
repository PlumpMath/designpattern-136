package com.vasty.greatstudy.designpattern.strategy.headfirst.badextend.step2;


/**
 * 橡皮鸭， 在第二个阶段成为隐患
 * Created by ZhuangYanHao on 2016/1/6.
 */
class RubberDuck extends Duck {

    @Override
    public void display() {
        //橡皮鸭
    }

    /**
     * 由于橡皮鸭是吱吱叫，所以覆盖了父类的方法，给了一个实现
     */
    @Override
    public void quack() {
        //吱吱叫
    }

    /**
     * 由于橡皮鸭不会飞，所以覆盖了父类的方法，给了一个空实现
     */
    @Override
    public void fly() {
    }
}
