package com.vasty.greatstudy.designpattern.composite.menu;

import java.util.Iterator;

/**
 * 叶子节点
 * Created by ZhuangYanHao on 2016/1/22.
 */
class MenuItem extends MenuComponent {

    String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("ITEM: " + getName());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}
