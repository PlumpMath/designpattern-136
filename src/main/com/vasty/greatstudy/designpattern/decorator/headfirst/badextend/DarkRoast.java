package com.vasty.greatstudy.designpattern.decorator.headfirst.badextend;

/**
 * 具体的某种饮料
 * Created by ZhuangYanHao on 2016/1/8.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "dark roast";
    }

    @Override
    public int cost() {
        int costCount = super.cost();
        costCount += 10;
        return costCount;
    }
}
