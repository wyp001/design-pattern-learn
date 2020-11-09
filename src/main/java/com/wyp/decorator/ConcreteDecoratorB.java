package com.wyp.decorator;

/**
 * 具体装饰角色
 */
public class ConcreteDecoratorB extends Decorator {


    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    //定义自己的修饰方法
    private void decorator(){
        System.out.println("添加滤镜.");
    }

    @Override
    public void operation() {
        this.decorator();
        super.operation();
    }

}
