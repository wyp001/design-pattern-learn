package com.wyp.bridge;

/**
 * 扩展抽象化角色
 */
class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.operationImpl();
    }
}