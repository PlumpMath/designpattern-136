package com.vasty.greatstudy.designpattern.adapter.headfirst.objectadapter;

/**
 * 适配器
 * Created by ZhuangYanHao on 2016/1/19.
 */
public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.doSomething();
    }
}
