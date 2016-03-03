package com.vasty.greatstudy.designpattern.iterator.headfirst.iterator;

/**
 * 具体的实现
 * Created by ZhuangYanHao on 2016/1/22.
 */
public class ConcreateIterator<E> implements Iterator<E> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }

    @Override
    public void remove() {

    }
}
