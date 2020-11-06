package com.wyp.factory.abstractFactory;

public class Client {

    public static void main(String[] args) {
        FactoryA mFactoryA = new FactoryA();
        FactoryB mFactoryB = new FactoryB();
        //A厂当地客户需要容器产品A
        mFactoryA.createContainer().method1();
        //A厂当地客户需要模具产品A
        mFactoryA.createMould().method1();
        System.out.println("--------------------------------------------");
        //B厂当地客户需要容器产品B
        mFactoryB.createContainer().method1();
        //B厂当地客户需要模具产品B
        mFactoryB.createMould().method1();
    }
}
