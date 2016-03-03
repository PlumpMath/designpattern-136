package com.vasty.greatstudy.designpattern.decorator.headfirst.decorator;

import com.vasty.greatstudy.designpattern.decorator.headfirst.decorator.components.ConcreteComponent;
import com.vasty.greatstudy.designpattern.decorator.headfirst.decorator.decorators.ConcreteDecorater;

/**
 * 测试方法
 * Created by ZhuangYanHao on 2016/1/8.
 */
public class Main {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ConcreteDecorater comcreteDecorater = new ConcreteDecorater(component);
        //可以像这样被多个装饰者嵌套
        comcreteDecorater = new ConcreteDecorater(comcreteDecorater);
        comcreteDecorater = new ConcreteDecorater(comcreteDecorater);
    }
}
