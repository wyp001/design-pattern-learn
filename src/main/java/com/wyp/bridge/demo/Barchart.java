package com.wyp.bridge.demo;

/**
 * 步骤4：定义扩展抽象化角色（柱状图）
 */
class Barchart extends AbstractionGraph {

    public Barchart(IReport iReport) {
        super(iReport);
    }

    @Override
    void operation() {
        System.out.println("柱状图被访问.");
        iReport.operationImpl();
    }
}