package com.wyp.bridge.demo;

/**
 * 步骤2：定义具体实现化角色（资金报表）
 */
class CapitalReport implements IReport {

    @Override
    public void operationImpl() {
        System.out.println("资金报表被访问.");
    }
}