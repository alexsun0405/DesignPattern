package com.dp.section3;

public class Client {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        HouseCorp houseCorp = new HouseCorp(new House());
        houseCorp.makeMoney();
        System.out.println("-------------------------------------");
        ShanzhaiCorp shanzhaiCorp = new ShanzhaiCorp(new IPod());
        shanzhaiCorp.makeMoney();
        // 我也可以卖房子，只要我想。
        ShanzhaiCorp shanzhaiCorp2 = new ShanzhaiCorp(new House());
        shanzhaiCorp2.makeMoney();
    }
}
