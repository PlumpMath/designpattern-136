# 模板方法模式
- 定义：
     在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下，
     重新定义算法中的某些步骤。
- 模板方法中的钩子
钩子是一种声明在抽象类中的方法，但是只有空的或者默认的实现。 钩子的存在，可以让子类有能力对算法的不同点，进行挂钩。
要不要挂钩，由子类来决定。
例如：
```sh
    public abstract class CaffeineBevrageWithHook{
        void prepareRecipe() {
            boilWater();
            brew();
            pourInCup();
            if (customerWantsCondiments()) {
                addCondiments();
            }
        }

        abstract void brew();

        abstract void addCondiments();

        void boilWater() {
        }

        void pourInCup() {
        }

        //钩子方法， 提供了空（默认）的实现，子类可以覆盖这个方法， 但是不见得一定要这么用。
        boolean custormerWantsCondiments() {
            return true;
        }
    }
```

- 抽象方法与钩子
Q：当我们创建一个模板方法的时候，如何知道什么时候用钩子，什么时候用抽象方法呢？
A：“必须要实现的方法”使用抽象方法， “可选的”使用钩子

- 好莱坞原则
  别调用我们，我们会调用你。（不是很理解）
  例如： 高层组件对低层组件（类、 子类）的方式是， 允许低层组件把自己挂钩到系统上，但是高层组件会决定什么时候调用这些低层组件。以避免环状依赖。