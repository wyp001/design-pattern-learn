package com.wyp.proxy.dynamicProxy.CGLibDynamic;

/**
 * CGLib动态代理模式
 * 优点：
 *      CGLIB通过继承的方式进行代理、无论目标对象有没有实现接口都可以代理，弥补了JDK动态代理的缺陷。也即CGLib动态代理是面向类代理的
 * 缺点：
 *      1、CGLib创建的动态代理对象性能比JDK创建的动态代理对象的性能高不少，但是CGLib在创建代理对象时所花费的时间却比JDK多得多，
 *          所以对于单例的对象，因为无需频繁创建对象，用CGLib合适，反之，使用JDK方式要更为合适一些。
 *      2、由于CGLib由于是采用动态创建子类的方法，对于final方法，无法进行代理。
 */
public class Client {
    public static void main(String[] args) {
        WorkImplProxyLib cglib = new WorkImplProxyLib();
        WorkImpl workCglib = (WorkImpl) cglib.getWorkProxyImplInstance();
        workCglib.addWorkExperience();
    }
}
