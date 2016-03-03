package com.vasty.greatstudy.designpattern.observer.headfirst.pullupdate;

/**
 * 被观察者  ------- java.util中采用的是类，我们这里使用接口
 * Created by ZhuangYanHao on 2016/1/7.
 */
public interface IObserverable {

    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers(Object args);
}
