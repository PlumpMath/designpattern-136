package com.vasty.greatstudy.designpattern.iterator.headfirst.iterator;

/**
 * 引用Iterator的对象
 * Created by ZhuangYanHao on 2016/1/22.
 */
public interface Aggregate {

    Iterator createIterator();
}
