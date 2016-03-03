# 工厂模式

### 设计原则
Dependency Inversion Principle 依赖倒置原则
**要依赖抽象，不要依赖具体类**
不能让高层组件依赖具体低层组件，而且，不管高层组件和低层组件都应该依赖于抽象。
（例如， factory method中的IPizza成了这个抽象，高层的Store 依赖于这个，低层的具体Pizza也依赖了这个）
```sh
书上有下面这三个理论来帮助遵循这个原则：（显然，我们做不到，只能说尽量做到。然而，我们记住这些原则
有助于判断我们是否有理由忽略这些原则。例如，如果是一个不会改变的类，直接依赖具体类也没什么关系。。。）
- 变量不可以持有具体类的引用：如果使用new就会持有具体类的引用。可以采用工厂来避开这种做法。
- 不要让类派生自具体类： 如果派生自具体类，那么就会依赖具体类。 请派生自一个抽象。
- 不要覆盖基类中实现的方法： 如果覆盖了基类中实现的方法，那么你的基类就不是一个真正适合被继承的对象。
  基类中的方法，应该由子类共享。
```

### new关键字
虽然，我们很多时候使用了接口，但是具体到实例化的时候，还是需要new一个具体的实现。
这时候，我们还是要依赖于具体的实现。
当有一群相关的类的时候，我们通常有可能写出来如下的代码：
```sh
    Duck duck;
    if (picnic){
        duck = new MallardDuck();
    } else if (hunting) {
        duck = new DecoyDuck();
    } else if (inBathTub) {
        duck = new RubberDuck();
    }
```
这样的代码，一旦有需要变化和扩展，都要重新检查和修改类似的代码。
当使用new具体到具体的类的时候，我们的代码没有对修改关闭。（设计原则）
new 并不是错误的，只是，我们有时候应该把这部分会变化的部分抽象出来，进行封装。（设计原则）

### 工厂
于是，我们把这部分创建的代码从代码块中剥离出来，专门由工厂这个对象，来构建实例。
这样当需要创造具体的实例的时候，都可以复用这个构建方法的代码，起到类型改变，只需要修改这个方法的效果。

### 常用的方法
- 简单工厂  需要使用到创建对象的方法来实例化对象。**实际上，简单工厂只是一个编程习惯，并不是设计模式**
- 静态工厂  不需要实例化，但是不能通过继承来改变创建方法的行为。


### 真正的工厂模式
- 工厂方法模式
```sh
工厂方法模式，定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
```

- 抽象工厂模式
```sh
抽象工厂模式，提供了一个接口，用于创建相关或者依赖对象的家族，而不需要明确指定具体类。
```

### 抽象工厂模式与工厂方法模式的联系
一般来说

### 体会
其实，说来说去，这几个工厂方法之间的区别是很小的。
看上去， 工厂方法只是一个用于创造具体对象的抽象方法。而简单工厂是一个对象，里面有一个方法来创造对象，将这个简单工厂抽象，
就变成了一个抽象工厂（里面可以有多个工厂方法），并可以组合到需要使用到工厂的类中,进行动态的设置。
但是， 工厂方法用的是继承，要用到工厂方法，需要扩展一个类，然后实现其工厂方法。（简单，改动量较小）
而，抽象工厂用的是组合，并且可能有一组接口，相当于是整个产品的大接口。如果新增一个，可能需要修改整个接口。（功能较强）
都是为了把客户代码从实际产品中解耦掉。