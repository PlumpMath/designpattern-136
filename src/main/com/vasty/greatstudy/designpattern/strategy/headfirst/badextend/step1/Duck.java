package com.vasty.greatstudy.designpattern.strategy.headfirst.badextend.step1;


/**
 * 第一阶段  Duck基类:
 * 所有的鸭子都会呱呱叫，也都会游泳，所以由超类实现这部分代码<br/>
 * 但是鸭子又长得不一样，所以由每个鸭子自己处理display方法<br/>
 * 这样，有许多其他类型的鸭子来继承这个鸭子基类<br/>
 * Created by ZhuangYanHao on 2016/1/6.
 */
abstract class Duck {

    public void quack() {
    }

    public void swim() {
    }

    public abstract void display();

    //鸭子的其他方法...
}