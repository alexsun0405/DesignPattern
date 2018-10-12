package com.dp.section2;

/**
 * 抽象模板类
 */
public abstract class AbstractCalss {

    // 普通方法1, 由子类实现, 并且在模板方法中被调用
    protected abstract void doAnything();
    // 普通方法2, 由子类实现, 并且在模板方法中被调用
    protected abstract void doSomething();

    //模板方法
    public void templateMethod() {
        // 固定的逻辑
        this.doAnything();
        this.doSomething();
    }
}
