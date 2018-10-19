package com.dp.simple.section01;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三001");
        System.out.println("开始时间 2018-10-18 17:00");
        player.login("zhangsan","password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束时间 2018-10-18 18:00");
    }
}
