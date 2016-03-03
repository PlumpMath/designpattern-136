package com.vasty.greatstudy.designpattern.factory.headfirst.abstractfactory;

/**
 * 用于构建系列2的产品
 * Created by ZhuangYanHao on 2016/1/11.
 */
public class ConcreteFactory1 implements IAbstractFactory {

    @Override
    public IProductA createProductA(String type) {
        IProductA productA = null;
        if ("xxx".equals(type)) {
            productA =  new ProductA1();
        } else if ("yyy".equals(type)) {
            productA =  new ProductA1();
        }
        return productA;
    }

    @Override
    public IProductB createProductB(String type) {
        IProductB productB = null;
        if ("xxx".equals(type)) {
            productB =  new ProductB1();
        } else if ("yyy".equals(type)) {
            productB =  new ProductB1();
        }
        return productB;
    }
}
