package com.dp.section4;

public abstract class Abstraction {

    // 定义对实现化角色的引用
    private Implementor implementor;

    // 约束子类，必须实现该构造函数
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    // 自身的行为和属性
    public void request() {
        this.implementor.doSomething();
    }

    // 获得实现化的角色
    public Implementor getImplementor() {
        return this.implementor;
    }
}
