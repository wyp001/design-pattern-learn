package com.wyp.decorator;

/**
 * 要装饰的对象类
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("视频软件直播.");
    }
}
