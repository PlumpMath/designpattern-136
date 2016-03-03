package com.vasty.greatstudy.designpattern.proxy.headfirst.dynamicproxy;

/**
 * 测试运行
 * Created by ZhuangYanHao on 2016/2/26.
 */
public class Launcher {

    public static void main(String[] args) {
        PersonBean realPerson = new PersonBean();
        IPersonBean proxyPerson = ProxyFactory.getOwnerProxy(realPerson);
        proxyPerson.setName("zyh");
        System.out.println(proxyPerson.getName());
        System.out.println(proxyPerson.returnHello());
        proxyPerson.createError();
        proxyPerson.setScore(100);   //不允许设置，应该抛异常
        System.out.println(proxyPerson.getScore());
    }
}
