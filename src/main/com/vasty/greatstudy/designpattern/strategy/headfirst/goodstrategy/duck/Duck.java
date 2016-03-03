package com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.duck;

import com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.IFlyBehavior;
import com.vasty.greatstudy.designpattern.strategy.headfirst.goodstrategy.behavior.IQuackBehavior;

/**
 * 继承的方式，并不恰当，而接口的方式则不具备实现代码。<br/>
 * 幸好我们有一个设计原则可以用于这种情况：           <br/>
 * 找出来应用中可能需要变化的部分，把他们独立出来，不要和那些不需要变化的代码放在一起<br/>
 * 换句话说， 每次新的需求一来， 都会变化到某些代码，这些代码就是要抽出来的时候了</br>
 * 这个原则的另一个思考方式是： 把可能变化的部分取出来，并且封装起来， 以后可以轻易地扩充这个部分，
 * 而不影响到其他的部分</br>
 *
 * 目前来看， fly() 和 quack() 是变化的部分， 而其他的则是不需要变化的部分。<br/>
 * 我们把这两个抽出来， 一个是飞行行为相关的， 一个是叫行为相关的，使他们远离Duck类。例如，我们有一个类实现了呱呱叫，一个类实现了吱吱叫，
 * 还有一个类实现了不会叫</br>
 *
 * 我们希望一切能有弹性，还想能够动态改变鸭子的行为， 比如可以在运行时指定绿头鸭的到底是呱呱叫还是吱吱叫。</br>
 * 第二个设计原则： 针对接口编程（针对超类型 super type 编程），而不是针对实现编程。 </br>
 * 针对超类型编程的概念是 变量的声明类型应该是一个抽象类或者一个接口， 如此，只有是具体实现这个超类型的接口，都可以指定给这个变量。
 * 这意味着， 声明类的时候， 不用理会以后执行时的真正对象类型。
 * 例子：
 * 1. Dog d = new Dog();  d.bark();
 * 2. Animal animal = new Dog(); animal.bark();
 * 2. Animal animal = getAnimal();  animal.bark();    //运行时指定哪个animal
 *
 * 我们用接口来代表每个行为，而实现者不是具体的鸭子类， 反而是其他的类， 这被称为是“行为”类。即，由行为类来实现接口，而不是鸭子类</br>
 * 这和以前的做法有什么不同呢？ </br>
 * 以前的做法:                </br>
 * 行为是继承Duck超类的具体实现而来， 或是实现某个接口，由子类自己实现。 这两个做法都是依赖了“实现”。 我们被实现绑的死死的，没有办法
 * 更改行为。   </br>
 * 新的做法：                 </br>
 * 在我们新的设计中， 鸭子的之类使用接口所表示的行为， 所以实际的实现不会绑死在鸭子的之类中。（实现的代码在于FlyBehavior和QuackBehavior）
 * 的特定类中 </br>
 * 优点：
 * 1. 行为可以被复用（甚至可以不限于鸭子 = =）   2. 每增加一个行为，不会影响到既有的行为类，也不会影响到使用行为的鸭子类。 </br>
 * 我们享受到了继承带来的复用， 却没有继承带来的包袱。                                       </br>
 *
 * Created by ZhuangYanHao on 2016/1/6.
 */
public abstract class Duck {

    IFlyBehavior flyBehavior;            //只是暂时这么做，以后的设计模式，会改变这个方式
    IQuackBehavior quackBehavior;        //只是暂时这么做，以后的设计模式，会改变这个方式

    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        }
    }

    public void performFly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void swim() {
        //共同的游泳行为
    }

    public abstract void display();

    /**
     * 动态地设置飞行行为
     * @param flyBehavior 飞行行为
     */
    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 动态地设置叫行为
     * @param quackBehavior 叫行为
     */
    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
