package com.wyp.strategy.v2;

/**
 * 移动方式 B
 */
public class MoveModeB implements MoveBehavior {
    @Override
    public void move() {
        System.out.println("移动方式 B");
    }
}
