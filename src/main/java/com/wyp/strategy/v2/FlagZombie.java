package com.wyp.strategy.v2;

/**
 * 旗手僵尸类
 */
public class FlagZombie extends AbstractZombie {
    public FlagZombie(MoveBehavior moveBehavior, AttackBehavior attackBehavior) {
        super(moveBehavior, attackBehavior);
    }

    @Override
    public void display() {
        System.out.println("我是旗手僵尸");
    }
}
