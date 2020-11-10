package com.wyp.adapter.classAdapter;

/**
 * 适配器类（Adapter）
 *    适配器Adapter继承自Adaptee，同时又实现了目标(Target)接口。
 */
public class Adapter extends Adaptee implements Target{

    //目标接口要求调用operation()这个方法名，但源类Adaptee没有方法operation()
    //因此适配器补充上这个方法名
    //但实际上operation()只是调用源类Adaptee的SpecificOpertaion()方法的内容
    //所以适配器只是将SpecificOpertaion()方法作了一层封装，封装成Target可以调用的operation()而已
    @Override
    public void operation() {
        this.specificOperation();
    }
}
