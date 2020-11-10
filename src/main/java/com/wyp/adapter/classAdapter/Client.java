package com.wyp.adapter.classAdapter;

/**
 * 类的适配器模式
 *  适配器类继承了被适配的类，实现了目标接口，适配器类在实现目标接口方法中调用被适配类的方法
 */
public class Client {
    public static void main(String[] args) {
        Target mAdapter = new Adapter();
        mAdapter.operation(); //此处调用适配器的operation()方法即可调用到被适配的类的specificOperation()方法
    }
}
