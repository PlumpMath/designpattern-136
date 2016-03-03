package com.vasty.greatstudy.designpattern.factory.headfirst.abstractfactory;

/**
 * 抽象工厂
 * Created by ZhuangYanHao on 2016/1/11.
 */
public interface IAbstractFactory {

    /**
     * 获取产品A，并传入产品A的二级类型
     * @param type 二级类型
     * @return 实例
     */
    IProductA createProductA(String type);

    IProductB createProductB(String type);
}
