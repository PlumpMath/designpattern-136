package com.vasty.greatstudy.designpattern.proxy.headfirst.dynamicproxy;

/**
 * 实例
 * Created by ZhuangYanHao on 2016/2/26.
 */
public class PersonBean implements IPersonBean{

    private String name;
    private int score;

    public PersonBean(){
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void createError(){
        throw new RuntimeException("调用原对象方法产生异常");
    }

    @Override
    public String returnHello() {
        return "Hello";
    }


}
