package com.wyp.factory.abstractFactory;

/**
 * B厂 - 生产模具+容器产品
 */
public class FactoryB extends Factory {
    @Override
    public AbstractProduct createContainer() {
        return new ContainerProductB();
    }

    @Override
    public AbstractProduct createMould() {
        return new MouldProducB();
    }
}
