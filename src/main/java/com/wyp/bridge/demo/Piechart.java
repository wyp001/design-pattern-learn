package com.wyp.bridge.demo;

/**
 * 步骤4：定义扩展抽象化角色（饼图）
 */
class Piechart extends AbstractionGraph {

    public Piechart(IReport iReport) {
        super(iReport);
    }

    @Override
    void operation() {
        System.out.println("饼图被访问.");
        iReport.operationImpl();
    }
}