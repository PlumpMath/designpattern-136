package com.vasty.greatstudy.designpattern.command.headfirst.lightdemo;

/**
 * 具体的命令: 电亮点灯
 * Created by ZhuangYanHao on 2016/1/15.
 */
public class LightOnCommand implements ICommand {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
