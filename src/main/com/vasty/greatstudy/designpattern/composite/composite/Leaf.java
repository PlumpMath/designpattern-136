package com.vasty.greatstudy.designpattern.composite.composite;

/**
 * 没有子节点的Component
 * Created by ZhuangYanHao on 2016/1/22.
 */
class Leaf implements Component {

    @Override
    public void add(Component component) {
        //没有意义
    }

    @Override
    public void remove(Component component) {
        //没有意义
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void otherOperation() {
        //doSomething
    }


}
