package com.wyp.proxy.dynamicProxy.jdkDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class ProxyHandler implements InvocationHandler {

    private Subject subject; // 定义主题接口

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 如果是第一次调用，生成真实主题
        if (subject == null) {
            subject = new RealSubject();
        }

        if ("request".equalsIgnoreCase(method.getName())) {
            System.out.println("访问真实主题之前的预处理。");
            Object result = method.invoke(subject, args);
            System.out.println("访问真实主题之后的后续处理。");
            return result;
        } else {
            // 如果不是调用request方法，返回真实主题完成实际操作
            return method.invoke(subject, args);
        }
    }

    // 使用Proxy.newProxyInstance生成代理对象
    static Subject createProxy() {
        Subject proxy = (Subject) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(), // 当前类的类加载器
                new Class[]{Subject.class}, //被代理的主题接口
                new ProxyHandler() // 代理对象，这里是当前对象
        );
        return proxy;
    }
}