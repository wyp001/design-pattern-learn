package com.wyp.state;

/**
 * 状态模式
 * 解决的问题:
 *      对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
 */
public class Client {
    public static void main(String[] args) {
        //创建环境
        Context context = new Context();
        //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
