package com.wyp.strategy.v2;

/**
 * 攻击模式A
 */
public class AttackModeA implements AttackBehavior{
    @Override
    public void attack() {
        System.out.println("攻击模式 A");
    }
}
