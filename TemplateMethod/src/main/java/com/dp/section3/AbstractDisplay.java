package com.dp.section3;

public abstract class AbstractDisplay {
    abstract void open();

    abstract void print();

    abstract void close();

    // 模板方法
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
