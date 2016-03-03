package com.vasty.greatstudy.designpattern.composite.menu;

import java.util.Iterator;

/**
 * 空的迭代器
 * Created by ZhuangYanHao on 2016/1/25.
 */
class NullIterator implements Iterator{

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
    }
}
