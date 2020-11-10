package com.wyp.bridge;

/**
 * 具体实现化角色
 */
class ConcreteImplementorA implements Implementor {

    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}