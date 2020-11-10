package com.wyp.bridge.demo;

/**
 * 步骤3：定义抽象化角色，图形
 */
abstract class AbstractionGraph {
    protected IReport iReport;

    public AbstractionGraph(IReport iReport) {
        this.iReport = iReport;
    }

    abstract void operation();
}