# 命令模式

### 命令模式中存在的主要对象
- 在看完后过来补充这个内容
1. Client   对象
2. Command  接口
3. Invoker  对象
4. Receiver 对象

### 心得体会
感觉这个模式 主要是使得调用者的代码相对固定，而接收者可以扩展（提供对应的命令，命令知道接收者是谁）。
调用者不用关心目前的接收者都是谁。只要关心什么时候该执行命令即可。

### 空对象的使用
    public class RemoteControl {
        Command[] onCommands;
        Command[] offCommands;

        public RemoteControl() {
            onCommands = new Command[7];
            offCommands = new Command[7];

            Command noCommand = new NoCommand();
            for (int i = 0; i < 7; i++) {
                onCommand[i] = noCommand;
                offCommand[i] = noCommand;
            }
        }
    }
上面这种写法，使用了空对象的例子。在很多设计模式中，都使用到了空对象。有时候，空对象也被当做是一个设计模式。
这种写法避免了以后调用的时候，写出如下的代码：

    if (command[i] != null) {
        command[i].execute();
    }

### 宏命令
一下子调用多个命令

    public class MacroCommand implements Command {
        Command[] commands;

        public MacroCommand(Command[] commands) {
            this.commands = commands;
        }

        public void execute() {
            for (int i = 0; i < commands.length; i++) {
                commands[i].execute();
            }
        }
    }

### 命令模式的用途
命令将运算块打包了，里面有一个接收者和一组动作。 然后这个对象可以传递，在被创建很久以后依然可以调用，甚至是不同的线程。
利用这个特性，可以利用它衍生一些应用： 例如 Scheduler任务、 线程池、 工作队列等等。
1. 工作队列： 某一端在添加命令，另一端则是线程。线程从队列中取出一个命令，调用execute方法，等待调用完成后，再将这个
命令丢弃，取出下一个命令。
2. 日志请求：
某些应用需要我们将所有动作都记录在日志中，并且在系统死机后，重新调用这些动作，恢复到之前的状态。
可以通过store()方法和load()方法来实现（Command接口中添加这两个）。 虽然可以用序列化的形式，但是序列化最好用于持久化(不理解)。
具体做法是： 执行命令的时候，将历史记录存在磁盘(store方法)中，然后,如果执行失败了。在某个时间点之后的命令通过load出来，依次调用
execute()方法来恢复。
再高级点的系统，还要加入事务操作。


