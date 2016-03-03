package com.vasty.greatstudy.designpattern.proxy.headfirst.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 对自己PersonBean对象的访问
 * Created by ZhuangYanHao on 2016/2/26.
 */
public class OwnerInvocationHandler implements InvocationHandler{

    IPersonBean person;

    //将person传入构造器，并保持引用。 否则没有被代理的实体。
    public OwnerInvocationHandler(IPersonBean person) {
        this.person = person;
    }

    /**
     * 每次proxy的方法被调用，就会调用到这个方法。
     * @param proxy    proxy   实际上并不能在这个invoke方法中调用这个代理的方法，因为调用了的话实际上会返回调用这个invoke方法。
     * @param method   被调用到的方法
     * @param args     方法的参数
     * @return         返回值
     * @throws IllegalAccessException
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setScore")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            } else {
                return method.invoke(person, args);
            }
        }catch (InvocationTargetException e) {    //如果真正主题抛出异常，那么会执行到这里
            e.printStackTrace();
            throw e;
        }
    }
}
