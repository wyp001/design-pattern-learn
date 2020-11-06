package com.wyp.factory.simpleFactory;

public class Client {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Product product = factory.creatProduct("A");
        product.method1();
        System.out.println("------------------------------");
        factory.creatProduct("B").method1();

    }

}
