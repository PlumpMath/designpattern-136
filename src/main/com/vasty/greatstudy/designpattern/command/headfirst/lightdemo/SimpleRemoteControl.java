package com.vasty.greatstudy.designpattern.command.headfirst.lightdemo;

/**
 * 简单的遥控器: Invoker
 * Created by ZhuangYanHao on 2016/1/15.
 */
public class SimpleRemoteControl {

    ICommand command;

    public SimpleRemoteControl() {
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    /**
     * 执行命令的时机
     */
    public void buttonPressed() {
        command.execute();
    }
}
