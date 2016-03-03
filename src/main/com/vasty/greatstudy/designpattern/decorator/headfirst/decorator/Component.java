package com.vasty.greatstudy.designpattern.decorator.headfirst.decorator;

/**
 * 装饰者组件基类： 所有的装饰者和具体的组件都是这个类的子类。
 * 个人感觉：
 * 实际上，被装饰过一次的类，会丧失掉具体的类型，而转化为这个类。
 * 因此，这里实际上没有必要使用接口，因为实际上没办法继承其他类了。
 * Created by ZhuangYanHao on 2016/1/8.
 */
public abstract class Component {

    public abstract void function();
}
