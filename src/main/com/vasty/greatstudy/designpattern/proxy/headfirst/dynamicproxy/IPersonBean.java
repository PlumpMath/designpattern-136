package com.vasty.greatstudy.designpattern.proxy.headfirst.dynamicproxy;

/**
 * IPersonBean 接口
 * Created by ZhuangYanHao on 2016/2/26.
 */
public interface IPersonBean {
    String getName();
    int getScore();
    void setName(String name);
    void setScore(int score);
    void createError();
    String returnHello();
}
