package com.vasty.greatstudy.designpattern.factory.headfirst.factorymethod;

/**
 * 工厂方法的创建者
 * Created by ZhuangYanHao on 2016/1/11.
 */
public abstract class Creator {

    /**
     * 利用这个工厂方法来获得某一类产品（如果只有一个地方的Pizza店，那么就是一个子类）
     * 注： 这种采用字符串的形式，容易出错。 可以使用枚举或者定义常量的方式等等。
     * 同时，这个方法不一定是抽象的，可以提供一个默认的
     * @param  type   大类下的小类
     * @return 具体的对象
     */
    public abstract IProduct factoryMethod(String type);

    public void anOperation(String type) {
        IProduct product = factoryMethod(type);
        product.doSomething();
    }
}
