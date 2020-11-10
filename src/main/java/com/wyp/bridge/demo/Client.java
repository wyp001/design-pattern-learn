package com.wyp.bridge.demo;

/**
 * 桥接模式
 */
public class Client {

    public static void main(String[] args) {
        //实现化和抽象化分离

        // 基本报表
        IReport basicReport = new BasicReport();
        // 往来报表
        IReport intercourseReport = new IntercourseReport();
        // 资金报表
        IReport capitalReport = new CapitalReport();

        // 基本报表使用柱状图
        AbstractionGraph barchart = new Barchart(basicReport);
        barchart.operation();
        System.out.println("------------------------");

        // 基本报表使用饼图
        AbstractionGraph piechart = new Piechart(basicReport);
        piechart.operation();
        System.out.println("------------------------");

        // 基本报表使用柱状图
        AbstractionGraph irBarchart = new Barchart(intercourseReport);
        irBarchart.operation();
        System.out.println("------------------------");

        // 往来报表使用饼图
        AbstractionGraph irPiechart = new Piechart(intercourseReport);
        irPiechart.operation();
    }

}