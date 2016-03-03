package com.vasty.greatstudy.designpattern.composite.menu;


import java.util.Iterator;
import java.util.Stack;

/**
 * FIXME: 这个类有bug。还没有理清楚。 我们目前还需要再研究组合模式以及其遍历
 * 主要是必须要维护好当前的位置。。。
 * 组合遍历器
 * Created by ZhuangYanHao on 2016/1/25.
 */
class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }


    /**
     * 自己写的，感觉有bug，因为不知道什么时候是合适的pop时机。如果是hasNext去pop，会不会导致如果不调用hasNext，一直调用next出错？
     * @return
     */
    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if (iterator.hasNext()) {
                return true;
            } else {
                stack.pop();
                return hasNext();
            }
        }
    }

    /**
     * 自己写的，感觉有bug，因为不知道什么时候是合适的pop时机。如果是hasNext去pop，会不会导致如果不调用hasNext，一直调用next出错？
     * @return
     */
    @Override
    public Object next() {
        Iterator iterator = (Iterator) stack.peek();
        if (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            Iterator nextIterator = component.createIterator();
            if (nextIterator.hasNext()) {
                stack.push(nextIterator);
            }
            return component;
        }else {
            return null;
        }
    }



//    @Override
//    public boolean hasNext() {
//        if (stack.isEmpty()) {
//            return false;
//        } else {
//            Iterator iterator = (Iterator) stack.peek();
//            if (!iterator.hasNext()) {
//                stack.pop();
//                return hasNext();
//            } else {
//                return true;
//            }
//        }
//    }
//
//    @Override
//    public Object next() {
//        if (hasNext()) {
//            Iterator iterator = (Iterator) stack.peek();
//            MenuComponent component = (MenuComponent) iterator.next();
//            if (component instanceof Menu) {
//                stack.push(component.createIterator());
//            }
//            return component;
//        } else {
//            return null;
//        }
//    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
