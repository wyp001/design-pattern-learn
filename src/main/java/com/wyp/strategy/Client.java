package com.wyp.strategy;

public class Client {
    public static void main(String[] args) {
        AbstractZombie normalZombie = new NormalZombie();
        AbstractZombie flagZombie = new FlagZombie();

        flagZombie.display();
        flagZombie.move();
        flagZombie.attack();
        System.out.println("---------------");

        normalZombie.display();
        normalZombie.move();
        normalZombie.attack();
    }
}
