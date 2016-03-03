package com.vasty.greatstudy.designpattern.factory.headfirst.abstractfactory;

/**
 * 客户
 * 这个客户类依赖于抽象工厂， 抽象工厂的具体实现负责产生 这个实现的风格对应的具体类型对象
 * Created by ZhuangYanHao on 2016/1/11.
 */
public class Client {

    IAbstractFactory factory;

    public Client(IAbstractFactory factory) {
        this.factory = factory;
    }

    public IProductA createProductA() {
        return factory.createProductA("");
    }

    public IProductB createProductB() {
        return factory.createProductB("");
    }
}
