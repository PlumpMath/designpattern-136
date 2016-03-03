package com.vasty.greatstudy.designpattern.observer.headfirst.pullupdate.observable;

import com.vasty.greatstudy.designpattern.observer.headfirst.pullupdate.IObserver;
import com.vasty.greatstudy.designpattern.observer.headfirst.pullupdate.IObserverable;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气数据
 * Created by ZhuangYanHao on 2016/1/7.
 */
public class WeatherData implements IObserverable {

    List<IObserver> observerList = new ArrayList<>();
    String temperature;
    String humidity;
    String pressure;

    public WeatherData() {
    }

    @Override
    public void registerObserver(IObserver observer) {
        if (observer == null) {
            return;
        }
        if (observerList.indexOf(observer) < 0) {
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(IObserver observer) {
        if (observer == null) {
            return;
        }
        int i = observerList.indexOf(observer);
        if (i >= 0) {
            observerList.remove(i);
        }
    }

    @Override
    public void notifyObservers(Object args) {
        for (IObserver observer : observerList) {
            observer.update(this, args);
        }
    }

    public void setMeasurements(String temperature, String humidity, String pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers(null);            //这里传null，是因为采用拉取的方式，所以并没有把具体的数值传出去。
    }

    public String getTemerature() {
        return temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getPressure() {
        return pressure;
    }
}
