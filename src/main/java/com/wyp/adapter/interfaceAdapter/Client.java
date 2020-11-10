package com.wyp.adapter.interfaceAdapter;

/**
 * 接口适配器模式
 * 适配器为抽象类，实现了目标接口的所有
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter() {
            @Override
            public void m1() {
                // super.m1();
                System.out.println("-----调用了适配器的m1方法----------");
            }
        };
        adapter.m1();

        Adapter adapter2 = new Adapter() {
            @Override
            public void m2() {
                // super.m1();
                System.out.println("-----调用了适配器的m2方法----------");
            }
        };
        adapter2.m2();


    }
}
