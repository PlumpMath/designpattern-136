package com.vasty.greatstudy.designpattern.command.headfirst.lightdemo;

/**
 * 客户对象
 * 实际上，我们的Command执行完可以删除，也可以不删除，等等，对于Command的执行时机和执行操作都是很灵活的。
 * Created by ZhuangYanHao on 2016/1/15.
 */
public class Client {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();   //Invoker
        Light light = new Light();                                       //Receiver
        ICommand command = new LightOnCommand(light);                    //Command指定了Receiver
        remoteControl.setCommand(command);                               //Invoker加入一个Command
        remoteControl.buttonPressed();                                   //在合适的时机执行Command
    }
}
