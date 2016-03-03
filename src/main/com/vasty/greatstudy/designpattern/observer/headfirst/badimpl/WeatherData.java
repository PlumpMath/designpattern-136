package com.vasty.greatstudy.designpattern.observer.headfirst.badimpl;

/**
 * 这是一个不好的实现
 * 这样的实现，会导致
 * 1. 我们在每增加一个布告板的时候，都必须修改我们的代码。
 * 2. 我们无法在运行时动态地增加或者删除布告板。
 *
 * 实际上，我们并没有封装可能会改变的部分，也没有针对接口编程。
 * Created by ZhuangYanHao on 2016/1/7.
 */
class WeatherData {

    public String getTemerature() {
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

        //下面是不好的方式
        String temperature = getTemerature();
        String humidity = getHumidity();
        String pressure = getPressure();

        //////////////
        //实际上应该有办法获取这三个布告板对象
        //////////////
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();

        currentConditionDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
    }
}
