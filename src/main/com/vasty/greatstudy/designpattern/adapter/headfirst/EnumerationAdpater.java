package com.vasty.greatstudy.designpattern.adapter.headfirst;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 转换Enumeration适配Iterator
 * Created by ZhuangYanHao on 2016/1/19.
 */
public class EnumerationAdpater implements Iterator {

    Enumeration enumeration;

    public EnumerationAdpater(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
