package com.vasty.greatstudy.designpattern.iterator.headfirst.dineriterator;

/**
 * 测试
 * Created by ZhuangYanHao on 2016/1/22.
 */
public class Test {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        Iterator iterator = dinerMenu.createIterator();
        while(iterator.hasNext()) {
            DinerItem item = (DinerItem) iterator.next();
            System.out.println(item.getName());
        }
    }
}
