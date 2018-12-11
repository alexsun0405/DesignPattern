package com.dp.section2;

public class IPodCorp extends Corp {
    @Override
    protected void produce() {
        System.out.println("生产IPod");
    }

    @Override
    protected void sell() {
        System.out.println("销售IPod");
    }

    public void makeMoney() {
        super.makeMoney();
        System.out.println("IPod赚钱");
    }
}
