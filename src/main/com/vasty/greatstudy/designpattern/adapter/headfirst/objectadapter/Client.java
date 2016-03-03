package com.vasty.greatstudy.designpattern.adapter.headfirst.objectadapter;

/**
 * 客户
 * Created by ZhuangYanHao on 2016/1/19.
 */
class Client {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
