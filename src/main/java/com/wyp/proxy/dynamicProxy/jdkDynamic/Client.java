package com.wyp.proxy.dynamicProxy.jdkDynamic;

/**
 * JDK动态代理模式：
 * 优点：
 *      1、不需要为真实主题写一个形式上完全一样的封装类，减少维护成本；
 *      2、可以在运行时制定代理类的执行逻辑，提升系统的灵活性；
 * 缺点：
 *      JDK动态代理，真实主题必须实现的主题接口，如果真实主题没有实现主题接口，或者没有主题接口，则不能生成代理对象。即JDK动态代理是面向接口代理的
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = ProxyHandler.createProxy();
        subject.request();
    }
}
