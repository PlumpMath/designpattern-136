# 状态模式

### HeadFirst中的初步需求（对应candy.bad）
一个糖果机，有四种状态：
1. 没有25分钱
2. 有25分钱
3. 售出糖果
4. 糖果售罄

1 --- > 2  投入25分钱

2 --- > 1  退回25分钱

2 --- > 3  摇动曲柄

3 --- > 1  发放糖果、且糖果机内有糖果

3 --- > 4  发放糖果、且糖果机内无糖果

### 新增的需求
在摇动曲柄的时候，有10%的概率会掉出来两个糖果。（增加点花样）
做法：
1. 定义一个State接口。 在这个接口内， 糖果机的每一个动作都有一个对应的方法。
2. 然后为机器中的每一个状态实现状态类。 这些状态负责在对应状态下进行机器的行为。
3. 最后， 我们要摆脱旧的条件代码，取而代之的是， 将动作委托到状态类。




