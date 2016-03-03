package com.vasty.greatstudy.designpattern.decorator.headfirst.decorator.decorators;

import com.vasty.greatstudy.designpattern.decorator.headfirst.decorator.Component;
import com.vasty.greatstudy.designpattern.decorator.headfirst.decorator.Decorator;

/**
 * 具体的某个装饰者,可以一直嵌套
 * Created by ZhuangYanHao on 2016/1/8.
 */
public class ConcreteDecorater extends Decorator {

    public ConcreteDecorater(Component component) {
        super(component);
    }

    @Override
    public void function() {
        //在被装饰的方法之前，做一些事情
        super.function();
        //在被装饰的方法之后，做一些事情
    }
}
