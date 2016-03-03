package com.vasty.greatstudy.designpattern.observer.headfirst.pullupdate.observer;

import com.vasty.greatstudy.designpattern.observer.headfirst.pullupdate.IObserver;
import com.vasty.greatstudy.designpattern.observer.headfirst.pullupdate.IObserverable;
import com.vasty.greatstudy.designpattern.observer.headfirst.pullupdate.observable.WeatherData;

/**
 * 预报显示
 * Created by ZhuangYanHao on 2016/1/7.
 */
public class ForecastDisplay implements IObserver{

    String temperature;

    @Override
    public void update(IObserverable observerable, Object args) {
        if (observerable instanceof WeatherData) {
            temperature = ((WeatherData) observerable).getTemerature();   //拉取数据
            display();
        }
    }


    public void display() {
    }
}
