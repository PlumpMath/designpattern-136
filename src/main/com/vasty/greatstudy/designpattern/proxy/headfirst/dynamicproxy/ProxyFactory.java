package com.vasty.greatstudy.designpattern.proxy.headfirst.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 代理获取工厂
 * Created by ZhuangYanHao on 2016/2/26.
 */
public class ProxyFactory {

    /**
     * 这个方法需要一个Person对象作为参数，然后返回其代理
     * @param personBean Person对象
     * @return           一个Person的代理对象
     */
    public static IPersonBean getOwnerProxy(IPersonBean personBean) {
        //动态地创建代理
        return (IPersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                                                    personBean.getClass().getInterfaces(),
                                                    new OwnerInvocationHandler(personBean));
    }
}
