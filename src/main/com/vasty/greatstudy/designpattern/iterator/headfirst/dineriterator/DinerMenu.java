package com.vasty.greatstudy.designpattern.iterator.headfirst.dineriterator;

/**
 * 菜单
 * Created by ZhuangYanHao on 2016/1/22.
 */
public class DinerMenu {

    DinerItem[] items;

    public DinerMenu() {
        items = new DinerItem[7];
        for (int i = 0; i < 7; i++) {
            DinerItem item = new DinerItem("DinerItem " + i);
            items[i] = item;
        }
    }

    public Iterator createIterator() {
        return new ArrayIterator(items);
    }
}
