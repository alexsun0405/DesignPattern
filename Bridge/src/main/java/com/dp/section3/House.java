package com.dp.section3;

public class House extends Product {
    @Override
    void beProducted() {
        System.out.println("这是生产出来的房子");
    }

    @Override
    void beSelled() {
        System.out.println("生产的房子要卖掉");
    }
}
