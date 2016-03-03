# 外观模式(facade pattern)

```sh
定义： 提供了统一的接口，用来访问子系统中的一群接口。 外观定义了一个高层接口， 让子系统更加
容易使用。
```

### 最小知识原则
**设计原则： 只和你的密友谈话**
实践上，在该对象的方法内，我们应该只调用属于以下范围内的方法：
  1. 该对象本身
  2. 被当做方法参数传进来的对象
  3. 这个方法所创建或者实例化的对象
  4. 对象的任何组件 （"有一个"）

**反例：**

    public float getTemp() {
        Termometer therometer = station.getThermometer();
        return therometer.getTemperature();
    }

根据我们的原则， 我们要求这个对象直接为我们做出请求。
**正确的做法**

    public float getTemp() {
        return station.getTemperature();
    }

最小知识原则的缺点是更多的跟多的包装会被创建出来。
