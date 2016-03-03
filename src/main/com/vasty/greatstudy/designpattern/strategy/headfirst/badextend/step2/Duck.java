package com.vasty.greatstudy.designpattern.strategy.headfirst.badextend.step2;


/**
 * 第二阶段 Duck基类:
 * 公司决定让鸭子能飞！ <br/>
 * 在这个基类中，加入了一个fly()方法，然而，这个行为会使得橡皮鸭也能飞！ <br/>
 * 所以，在超类中加入的方法会影响所有的子类，使得某些不需要的子类也具有一些不恰单的行为<br/>
 * 为了修正这个bug， 在子类中对父类方法进行覆盖, 见RubberDuck类<br/>
 * 使用继承来解决这个问题，有如下的缺点：<br/>
 * 1. 代码在多个子类中重复<br/>
 * 2. 运行时的行为不容易改变<br/>
 * 3. 难以得知鸭子的所有行为<br/>
 * 4. 改变会牵一发而动全身，造成其他鸭子不想要的改变<br/>
 * 每当有新的鸭子来到，都要被迫检查并可能需要覆盖fly() 和 quack(), 这可能是无穷尽的噩梦。
 * Created by ZhuangYanHao on 2016/1/6.
 */
abstract class Duck {

    public void quack() {
    }

    public void swim() {
    }

    public abstract void display();

    //由于公司决定 让鸭子能飞，所以加上了这个方法
    public void fly() {
    }
}