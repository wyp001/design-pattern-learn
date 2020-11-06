package com.wyp.factory.factoryMethod;

public class Client {

    public static void main(String[] args) {
        Factory aFactory = new FactoryA();
        Product product = aFactory.createProduct();
        product.method1();
        System.out.println("-------------------------------------");
        Factory bFactory = new FactoryB();
        Product product1 = bFactory.createProduct();
        product1.method1();


    }

}
