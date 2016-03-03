package com.vasty.greatstudy.designpattern.command.headfirst.command;

/**
 * 一个请求接口。
 * 调用命令对象的execute方法会使得具体接收者进行相对应的动作。
 * 这里还加了一个undo的方法
 * Created by ZhuangYanHao on 2016/1/19.
 */
interface Command {

    void execute();
}
