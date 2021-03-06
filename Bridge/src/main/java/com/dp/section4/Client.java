package com.dp.section4;

public class Client {
    public static void main(String[] args) {
        // 定义一个实现化角色
        Implementor implementor = new ConcreteImplementor2();
        // 定义一个抽象化角色
        Abstraction abs = new RefinedAbstraction(implementor);
        // 执行请求
        abs.request();
    }
}
