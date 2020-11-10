package com.wyp.bridge;

/**
 * 桥接模式
 */
public class Client {
    public static void main(String[] args) {

        Implementor imple=new ConcreteImplementorA();
        Abstraction abs=new RefinedAbstraction(imple);
        abs.operation();

    }
}