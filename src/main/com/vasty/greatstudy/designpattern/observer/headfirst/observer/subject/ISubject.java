package com.vasty.greatstudy.designpattern.observer.headfirst.observer.subject;

import com.vasty.greatstudy.designpattern.observer.headfirst.observer.observer.IObserver;

/**
 * 主题接口
 * Created by ZhuangYanHao on 2016/1/7.
 */
public interface ISubject {

    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();
}
