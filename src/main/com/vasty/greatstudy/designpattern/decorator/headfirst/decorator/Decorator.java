package com.vasty.greatstudy.designpattern.decorator.headfirst.decorator;

/**
 * 装饰者基类，所有装饰者继承自这个类
 * Created by ZhuangYanHao on 2016/1/8.
 */
public class Decorator extends Component {

    public Component component;   //被装饰的对象

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void function() {
        component.function();
    }
}
