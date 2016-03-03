package com.vasty.greatstudy.designpattern.strategy.headfirst.badinterface;


/**
 * 橡皮鸭， 在第二个阶段成为隐患
 * Created by ZhuangYanHao on 2016/1/6.
 */
class RubberDuck extends Duck implements IQuackable {

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

    //橡皮鸭不能飞
}
