package com.vasty.greatstudy.designpattern.composite.composite;

/**
 * 对于客户来说，都是使用Component
 * Created by ZhuangYanHao on 2016/1/22.
 */
interface Component {

    void add(Component component);

    void remove(Component component);

    Component getChild(int i);

    void otherOperation();
}
