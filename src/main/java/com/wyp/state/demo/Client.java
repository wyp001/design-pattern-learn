package com.wyp.state.demo;

/**
 * 状态模式
 * 优点：
 * 1、状态模式将与特定状态相关的行为局部化到一个状态中，并且将不同状态的行为分割开来，满足“单一职责原则”。
 * 2、减少对象间的相互依赖。将不同的状态引入独立的对象中会使得状态转换变得更加明确，且减少对象间的相互依赖。
 * 3、有利于程序的扩展。通过定义新的子类很容易地增加新的状态和转换。
 * 缺点：
 * 1、状态模式的使用必然会增加系统的类与对象的个数。
 * 2、状态模式的结构与实现都较为复杂，如果使用不当会导致程序结构和代码的混乱。
 */
public class Client {
    public static void main(String[] args) {

        ThreadContext context = new ThreadContext();
        context.start();
        context.getCPU();
        context.suspend();
        context.resume();
        context.getCPU();
        context.stop();
    }
}
