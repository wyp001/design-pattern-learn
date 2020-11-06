package com.wyp.strategy.v2;

/**
 * 移动方式 A
 */
public class MoveModeA implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("移动方式 A");
    }
}
