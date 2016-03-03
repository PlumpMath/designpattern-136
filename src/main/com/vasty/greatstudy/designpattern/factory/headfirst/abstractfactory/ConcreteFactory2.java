package com.vasty.greatstudy.designpattern.factory.headfirst.abstractfactory;

/**
 * 用于构建系列2的产品
 * Created by ZhuangYanHao on 2016/1/11.
 */
public class ConcreteFactory2 implements IAbstractFactory {

    @Override
    public IProductA createProductA(String type) {
        IProductA productA = null;
        if ("xxx".equals(type)) {
            productA =  new ProductA2();
        } else if ("yyy".equals(type)) {
            productA =  new ProductA2();
        }
        return productA;
    }

    @Override
    public IProductB createProductB(String type) {
        IProductB productB = null;
        if ("xxx".equals(type)) {
            productB =  new ProductB2();
        } else if ("yyy".equals(type)) {
            productB =  new ProductB2();
        }
        return productB;
    }
}
