package com.wyp.factory.abstractFactory;

/**
 * 工厂抽象类
 */
public abstract class Factory {
    public abstract AbstractProduct createContainer();
    public abstract AbstractProduct createMould();
}
