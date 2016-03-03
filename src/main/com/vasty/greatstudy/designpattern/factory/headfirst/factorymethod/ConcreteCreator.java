package com.vasty.greatstudy.designpattern.factory.headfirst.factorymethod;

/**
 * 某个类的具体创建者
 * Created by ZhuangYanHao on 2016/1/11.
 */
public class ConcreteCreator extends Creator{

    @Override
    public IProduct factoryMethod(String type) {
        IProduct product = null;
        if ("xxx".equals(type)) {
            product = new ConcreteProduct();
        } else if ("yyy".equals(type)) {
            product = new ConcreteProduct();  //应该是另外一个
        }
        return product;
    }
}
