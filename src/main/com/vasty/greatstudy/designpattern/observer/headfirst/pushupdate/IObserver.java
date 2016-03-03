package com.vasty.greatstudy.designpattern.observer.headfirst.pushupdate;

/**
 * 观察者接口
 * Created by ZhuangYanHao on 2016/1/7.
 */
public interface IObserver {

    /**
     * 这里直接将参数传入。 然而，参数的个数和种类可能改变。 那么实现了这个接口的类,都要重新更改实现方法。这显然不合适。
     * 而且，可能有许多的类，并不需要这所有的数据
     */
    void update(String temperature, String humidity, String pressure);
}
