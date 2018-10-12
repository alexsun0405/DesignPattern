package com.dp.section1;

public abstract class AbstractBlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("Black Color");
    }

    @Override
    public void talk() {
        System.out.println("I am Black");
    }
}
