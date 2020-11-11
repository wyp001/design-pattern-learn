package com.wyp.proxy.dynamicProxy.jdkDynamic;

/**
 * 真实主题
 */
class RealSubject implements Subject {
    public void request() {
        System.out.println("访问真实主题方法...");
    }
}