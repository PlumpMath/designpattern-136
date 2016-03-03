package com.vasty.greatstudy.designpattern.composite.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 菜单
 * Created by ZhuangYanHao on 2016/1/22.
 */
class Menu extends MenuComponent {

    List<MenuComponent> menuComponents = new ArrayList();
    String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("-------------------------------");
        System.out.println("MENU:" + getName());
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
