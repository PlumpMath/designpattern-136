package com.vasty.greatstudy.designpattern.iterator.headfirst.iterator;

/**
 * 迭代器
 * Created by ZhuangYanHao on 2016/1/22.
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();

    void remove();
}
