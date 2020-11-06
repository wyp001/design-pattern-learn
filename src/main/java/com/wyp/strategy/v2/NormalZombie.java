package com.wyp.strategy.v2;

/**
 * 普通僵尸类
 */
public class NormalZombie extends AbstractZombie {
    public NormalZombie(MoveBehavior moveBehavior, AttackBehavior attackBehavior) {
        super(moveBehavior, attackBehavior);
    }

    @Override
    public void display() {
        System.out.println("我是普通僵尸");
    }
}
