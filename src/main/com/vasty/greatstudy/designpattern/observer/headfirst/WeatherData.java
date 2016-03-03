package com.vasty.greatstudy.designpattern.observer.headfirst;

/**
 * 这个是其他的公司给予的对象，提供了前面四个方法
 * 期待开发出 三种布告板。 并且能够提供接口出来，让其他的公司也能开发布告板。
 * Created by ZhuangYanHao on 2016/1/7.
 */
public class WeatherData {

    public String getTemperature() {
        return "";
    }

    public String getHumidity() {
        return "";
    }

    public String getPressure() {
        return "";
    }

    public void measurementsChanged() {
        // 当参数发生变化的时候，这个对象会被调用。
    }
}
