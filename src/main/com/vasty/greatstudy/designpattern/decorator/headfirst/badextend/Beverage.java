package com.vasty.greatstudy.designpattern.decorator.headfirst.badextend;

/**
 * 饮料基类
 * 这个模式存在的改变的地方有：
 * 1. 调料的增加会改变到 基类的代码。
 * 2. 调料价格的改变也会改变到基类的代码。（设计死板）
 * 3. （基类加入的新功能不适用于所有子类）对于一些新的饮料，他们可能不需要这么多的调料。
 * （正如策略模式中， 橡皮鸭子会飞造成的问题， 这些调料本不该出现在某种饮料中）。
 * 正确的做法应该是：
 * 1. 拿一个DarkRoast对象
 * 2. 以mocha对象装饰它
 * 3. 以Whip对象装饰它
 * 4. 调用cost()方法， 并且依赖委托(delegate)将调料的价格加上去。
 * Created by ZhuangYanHao on 2016/1/8.
 */
public class Beverage {

    /**具体饮料的描述*/
    String description;

    /////////////////////
    //下面是是否拥有各种调料
    /////////////////////
    boolean milk  = false;
    boolean soy   = false;
    boolean mocha = false;
    boolean whip  = false;

    /**
     * 这个方法用于计算调料的价格。然后子类覆盖这个方法加上自己的饮料的钱，就可以算出来全部的价格了
     * @return  调料部分的价格
     */
    public int cost() {
        int costCount = 0;
        if (milk) {
            costCount += 1;
        }
        if (soy) {
            costCount += 2;
        }
        if (mocha) {
            costCount += 3;
        }
        if (whip) {
            costCount += 4;
        }
        return costCount;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public String getDescription() {
        return description;
    }
}
