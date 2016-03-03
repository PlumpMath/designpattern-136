package com.vasty.greatstudy.designpattern.factory.headfirst.simplefactory;

/**
 * PizzaStore是PizzaFactory的客户。
 * 在这个类中，利用了组合，所以甚至是整个工厂都可以替换掉（例如使用纽约的Pizza工厂等等）
 * 然而，还是有缺陷的，见下面代码中的注释。我们会在真正的工程设计模式来介绍这个功能。
 * Created by ZhuangYanHao on 2016/1/11.
 */
public class PizzaStore {

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public IPizza orderPizza(String type) {
        IPizza pizza = factory.createPizza(type);
        ///////////////////////////////////////////////
        //然而，虽然说这样子写满足了工厂的替换； 但是却不能够让纽约工厂和芝加哥工厂
        //在以下流程上的区别： 比如一家不需要cut。
        //////////////////////////////////////////////
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
