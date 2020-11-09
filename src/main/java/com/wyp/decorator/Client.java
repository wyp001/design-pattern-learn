package com.wyp.decorator;

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
