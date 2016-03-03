package com.vasty.greatstudy.designpattern.iterator.headfirst.dineriterator;

/**
 * 迭代器接口
 * Created by ZhuangYanHao on 2016/1/22.
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();
}
