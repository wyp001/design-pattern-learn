package com.wyp.bridge.demo;

/**
 * 步骤2：定义具体实现化角色（往来报表）
 */
class IntercourseReport implements IReport {

    @Override
    public void operationImpl() {
        System.out.println("往来报表被访问.");
    }
}