package com.dp.section3;

public class IPod extends Product {
    @Override
    void beProducted() {
        System.out.println("这是生产出来的IPod");
    }

    @Override
    void beSelled() {
        System.out.println("生产出来的IPod要卖掉");
    }
}
