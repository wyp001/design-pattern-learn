package com.wyp.strategy;

/**
 * 抽象僵尸类
 */
public abstract class AbstractZombie {

    // 外观
    public abstract void display();

    // 攻击方法
    public void attack(){
        System.out.println("咬");
    }

    // 移动方法
    public void move(){
        System.out.println("一步一步移动");
    }
}
