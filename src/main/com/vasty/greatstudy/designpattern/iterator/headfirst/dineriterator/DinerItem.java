package com.vasty.greatstudy.designpattern.iterator.headfirst.dineriterator;

/**
 * 菜单中的某一项
 * Created by ZhuangYanHao on 2016/1/22.
 */
public class DinerItem {

    private String name;

    public DinerItem(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
