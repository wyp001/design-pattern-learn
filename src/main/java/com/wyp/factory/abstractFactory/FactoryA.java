package com.wyp.factory.abstractFactory;

/**
 *  A厂 - 生产模具+容器产品
 */
public class FactoryA extends Factory {
    @Override
    public AbstractProduct createContainer() {
        return new ContainerProductA();
    }

    @Override
    public AbstractProduct createMould() {
        return new MouldProducA();
    }
}
