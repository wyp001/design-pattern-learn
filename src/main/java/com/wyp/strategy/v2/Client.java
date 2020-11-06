package com.wyp.strategy.v2;

public class Client {
    public static void main(String[] args) {
        // 普通僵尸 1 号
        System.out.println("-----普通僵尸 1 号------");
        NormalZombie normalZombie = new NormalZombie(new MoveModeA(), new AttackModeA());
        normalZombie.display();
        normalZombie.move();
        normalZombie.attack();

        // 普通僵尸 2 号
        System.out.println("-----普通僵尸 2 号------");
        NormalZombie normalZombie2 = new NormalZombie(new MoveModeA(), new AttackModeB());
        normalZombie2.display();
        normalZombie2.move();
        normalZombie2.attack();


        //旗手僵尸 1 号
        System.out.println("-----旗手僵尸 1 号------");
        FlagZombie flagZombie = new FlagZombie(new MoveModeB(), new AttackModeB());
        flagZombie.display();
        flagZombie.move();
        flagZombie.attack();

        //旗手僵尸 2 号
        System.out.println("-----旗手僵尸 2 号------");
        FlagZombie flagZombie2 = new FlagZombie(new MoveModeB(), new AttackModeA());
        flagZombie2.display();
        flagZombie2.move();
        flagZombie2.attack();

    }
}
