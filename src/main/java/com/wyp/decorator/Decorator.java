package com.wyp.decorator;

public class Decorator extends Component {

    private Component component=null;

    public Decorator(Component component) {
        this.component = component;
    }

    // 委托给被修饰者执行
    @Override
    public void operation() {
        this.component.operation();
    }
}
