package com.vasty.greatstudy.designpattern.command.headfirst.command;

/**
 * 具体的一个命令实现,这个定义了动作和接受者之间的绑定关系。
 * 调用者只要调用execute就可以发出请求，让ConcreteCommand调用接受者的一个或者多个动作
 * Created by ZhuangYanHao on 2016/1/19.
 */
public class ConcreteCommand implements Command{

    @Override
    public void execute() {
        new ConcreteReceiver().action();
    }
}
