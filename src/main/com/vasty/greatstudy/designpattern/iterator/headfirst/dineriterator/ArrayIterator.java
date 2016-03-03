package com.vasty.greatstudy.designpattern.iterator.headfirst.dineriterator;


import com.vasty.greatstudy.designpattern.iterator.headfirst.dineriterator.Iterator;

import java.util.NoSuchElementException;

/**
 * 数组的Iterator
 * Created by ZhuangYanHao on 2016/1/22.
 */
public class ArrayIterator<E> implements Iterator<E> {

    private E[] array;
    private int positon = -1;

    public ArrayIterator(E[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (array == null || array.length <= 0) {
            return false;
        }
        if (positon >= array.length - 1) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public E next() {
        if (positon < array.length - 1) {
            positon++;
            return array[positon];
        } else {
            throw new NoSuchElementException();
        }
    }
}
