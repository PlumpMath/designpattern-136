package com.vasty.greatstudy.designpattern.composite.menu;

import java.util.Iterator;

/**
 * 调用者
 *                             |
 *                           总目录
 *                             |
 *            1.0            1.1                      1.2
 *                             |                       |
 *                  1.1.0   1.1.1  1.1.2     1.2.0  1.2.1   1.2.2
 *                                                            |
 *                                                     1.2.2.0   1.2.2.1
 *
 *
 * Created by ZhuangYanHao on 2016/1/22.
 */
public class Waitress {

    MenuComponent allMenus;

    public Waitress() {
        allMenus = new Menu("总目录");
        //一级目录
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                allMenus.add(new MenuItem("1." + i));
            }else {
                allMenus.add(new Menu("1." + i));
            }
        }
        //二级目录 11
        MenuComponent component11 = allMenus.getChild(1);
        for (int i = 0; i < 3; i++) {
            component11.add(new MenuItem("1.1." + i));
        }
        //二级目录 12
        MenuComponent component12 = allMenus.getChild(2);
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                component12.add(new Menu("1.2." + i));
            }else {
                component12.add(new MenuItem("1.2." + i));
            }
        }
        //三级目录 122
        MenuComponent component122 = allMenus.getChild(2).getChild(2);
        for (int i = 0; i < 3; i++) {
            component122.add(new MenuItem("1.2.2." + i));
        }
    }

    public static void main(String[] args) {
        //内置的方式，来做迭代，并不能获取到遍历的对象。
        new Waitress().printMenu();
        //获取迭代器来获取对象，再把对象打印出来。
        new Waitress().printIterator();
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printIterator() {
        Iterator iterator = allMenus.createIterator();
        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            System.out.println(menuComponent.getName());
        }
    }
}
