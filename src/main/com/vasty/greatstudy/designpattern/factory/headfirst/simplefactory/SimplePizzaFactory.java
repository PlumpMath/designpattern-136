package com.vasty.greatstudy.designpattern.factory.headfirst.simplefactory;

/**
 * 简单工厂的例子(严格来说并不是设计模式，只是编程习惯)
 * Created by ZhuangYanHao on 2016/1/11.
 */
public class SimplePizzaFactory {

    public IPizza createPizza(String type) {
        IPizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PapperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
