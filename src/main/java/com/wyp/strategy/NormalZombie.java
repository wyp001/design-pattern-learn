package com.wyp.strategy;

/**
 * 普通僵尸类
 */
public class NormalZombie extends AbstractZombie {
    @Override
    public void display() {
        System.out.println("我是普通僵尸");
    }
}
