package com.wyp.strategy.v2;

/**
 * 抽象僵尸类
 */
public abstract class AbstractZombie {
    MoveBehavior moveBehavior;
    AttackBehavior attackBehavior;

    public AbstractZombie(MoveBehavior moveBehavior, AttackBehavior attackBehavior) {
        this.moveBehavior = moveBehavior;
        this.attackBehavior = attackBehavior;
    }

    public MoveBehavior getMoveBehavior() {
        return moveBehavior;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public AttackBehavior getAttackBehavior() {
        return attackBehavior;
    }

    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }


    // 外观
    public abstract void display();

    void move(){
        moveBehavior.move();
    }

    void attack() {
        attackBehavior.attack();
    }
}
