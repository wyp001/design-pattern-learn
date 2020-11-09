package com.wyp.decorator;

/**
 * 装饰模式
 * 优点：
 * 1.不改变原有对象的情况下给一个对象扩展功能；
 * 2.使用不同的组合可以实现不同的效果；
 * 3.符合开闭原则
 * 缺点：
 * 1.多层的装饰会使系统比较复杂。即一个实现类的功能若用多个装饰类进行装饰，则会增加该实现类的耦合度。
 */
public class Client {
    public static void main(String[] args) {
        // 添加美颜
        Component componentA  = new ConcreteDecoratorA(new ConcreteComponent());
        componentA.operation();

        System.out.println();

        // 添加滤镜
        Component componentB  = new ConcreteDecoratorB(new ConcreteComponent());
        componentB.operation();

        System.out.println();

        // 添加美颜和滤镜
        Component component  = new ConcreteDecoratorA(new ConcreteDecoratorB(new ConcreteComponent()));
        component.operation();
    }
}
