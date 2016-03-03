package com.vasty.greatstudy.designpattern.command.headfirst.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用者，持有命令对象，并且在合适的时候，执行
 * Created by ZhuangYanHao on 2016/1/19.
 */
public class Invoker {

    private List<Command> commandList = new ArrayList<>();

    void setCommand(Command command) {
        commandList.add(command);
    }
}
