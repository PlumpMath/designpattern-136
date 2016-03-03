package com.vasty.greatstudy.designpattern.observer.headfirst.pullupdate;

/**
 * 观察者
 * Created by ZhuangYanHao on 2016/1/7.
 */
public interface IObserver {

    /**
     * 更新方法
     * @param observerable 主题对象
     * @param args         更新的参数
     */
    void update(IObserverable observerable, Object args);
}
