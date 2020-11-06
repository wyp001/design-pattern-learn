package com.wyp.factory.factoryMethod;

public class FactoryA extends Factory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
