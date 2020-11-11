package com.wyp.proxy.dynamicProxy.CGLibDynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * 代理类
 */
class WorkImplProxyLib implements MethodInterceptor {

    // 创建代理对象
    Object getWorkProxyImplInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(WorkImpl.class);
        // 回调方法
        enhancer.setCallback(this);
        // 创建代理对象
        return enhancer.create();
    }

    // @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始...");
        methodProxy.invokeSuper(obj, args);
        System.out.println("结束...");
        return null;
    }
}