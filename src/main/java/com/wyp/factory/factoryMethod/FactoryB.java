package com.wyp.factory.factoryMethod;

public class FactoryB extends Factory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
