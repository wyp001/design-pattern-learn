package com.wyp.bridge.demo;

/**
 * 步骤2：定义具体实现化角色（基本报表）
 */
class BasicReport implements IReport {

    @Override
    public void operationImpl() {
        System.out.println("基本报表被访问.");
    }
}