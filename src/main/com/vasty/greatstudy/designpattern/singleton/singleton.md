# 单例模式
这个显然是很常见的模式了。就用文本来演进过程吧。

### 单例模式的定义
确保一个类只有一个实例，并且提供一个全局的访问点。


### 演变过程
- Version 1 （错误的示范）
```sh
    public class Singleton {

        private static Singleton uniqueInstance;

        private Singleton() {}

        pubilc static Singleton getInstance() {
            if (uniqueInstance == null) {
                uniqueInstance = new Singleton();
            }
            return uniqueInstance;
        }
    }
```
这个版本的单例，可以对应下面这个例子。

    public class ChocolateBoiler {

        private boolean empty;
        private boolean boiled;

        private static ChocolateBoiler sBoiler;

        public static ChocolateBoiler getInstance() {
            if (sBoiler == null) {
                sBoiler = new ChocolateBoiler();
            }
            return sBoiler;
        }

        //一开始的时候，锅炉里是空的
        private ChocolateBoiler () {
            empty = true;
            boild = false;
        }

        //填入原料的时候，也要是空的。
        public void fill() {
            if (empty) {
                empty = false;
                boiled = false;
                //填满巧克力等原料
            }
        }

        //排出时，必须是满的和熟的
        public void drain() {
            if (!empty && boil) {
                //排出煮沸的巧克力等原料
                empty = true;
            }
        }

        //必须是非空，而且非熟的
        public void boil() {
            if (!isEmpty && !isBoil) {
                boiled = true;
            }
        }
    }

这样的方式带来的问题：**在单例还是空的时候，有多线程调用getInstance，多线程可能前后判空，导致单例重新被初始化**。

- Version 2
同步getInstance方法
```sh
把getInstance变成 synchronize。
但是这样子的问题是，实际上只是需要第一次进入的时候做同步，后来都不需要了。而后来的同步，都是累赘。
由此，我们需要评估这样子的行为。
1. 如果 getInstance并不是频繁运行，这个方法造成效率下降100倍，并不重要，那么就留着吧。
2. 如果 “急切创建实例”，即这个实例总是要创建，或者在创建和运行时负担不是很重。那么就急切初始化Version 3
```

- Version 3
急切初始化： 这个实例总是要创建，或者在创建和运行时负担不是很重。
```sh
    public class Singleton {
        private static Singleton uniqueInstance = new Singleton();

        private Singleton() {}

        public static Singleton getInstance() {
            return uniqueInstance;
        }
    }
```

- Version 4
双重检查锁， 在getInstance中，未创建才进行同步。这正是我们想要的。如果性能是关心的重点，那么这正是我们需要的！
（如果是1.4和更早的版本，许多JVM对volatile关键字的实现会导致双重检查锁失效，即**必须在Java 5以上版本使用！**）
```sh
    public class Singleton {

        //volatile确保： 当uniqueInstance变量被初始化成Singleton实例的时候，
        //多个线程正确处理uniqueInstance变量。
        private volatile static Singleton uniqueInstace;

        private Singleton() {}

        public static Singleton getInstance() {
            if (uniqueInstance == null) {
                synchronized (Singleton.class) {
                    if (uniqueInstance == null) {
                        uniqueInstance = new Singleton();
                    }
                }
            }
            return uniqueInstance;
        }
    }

```

- 问题
1. ClassLoader有多个的情况：
如果有多个，那么每个ClassLoader的命名空间是独立的。这样会加载同一个类多次。
这样的事情如果发生在单件上，会存在多个单件并存的情况。
如果有多个ClassLoader那么又使用了单件模式，那么需要小心。
有一个解决办法是： 自行决定类加载器，并且使用同一个类加载器。

2. 单例模式与全局变量：
急切实例化 vs 延迟实例化
单例模式的宗旨是： 确保只有一个对象，并且提供全局访问。
而全局变量能保证全局访问，但是并不能确保只有一个实例，而且全局变量还会鼓励程序员用许多全局变量指向许多小对象，最后
造成命名控件的污染。










