package com.vasty.greatstudy.designpattern.strategy.headfirst.badinterface;


/**
 * 接口的方式 Duck基类:
 * 意识到继承可能不是良好的方式， 所以， 有一个想法是让某些鸭子类型能飞或者可叫。<br/>
 * 于是产生了接口的形式， 基类实现了swim和display， 而飞跟叫是在接口中实现。   <br/>
 * 这是个更加差的实现方式。 因为对于每个鸭子，都要稍微修改一下飞行的行为，比上一次的继承
 * 之后再修改的差异的办法，重复的代码更多，要做的工作也更多。                  <br/>
 * 这个实现方法是更大的噩梦                                                <br/>
 * Created by ZhuangYanHao on 2016/1/6.
 */
abstract class Duck {

    public void swim() {
    }

    public abstract void display();

    //这两个方法转移到接口中去
//    public void fly() {
//    }
//    public void quack() {
//    }
}