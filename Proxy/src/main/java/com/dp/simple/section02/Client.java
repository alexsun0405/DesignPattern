package com.dp.simple.section02;

public class Client {
    public static void main(String[] args) {
        // 被代理人
        IGamePlayer player = new GamePlayer("张三001");
        // 代理
        IGamePlayer proxy = new GamePlayerProxy(player);

        // 代理执行
        System.out.println("开始时间 2018-10-18 17:00");
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间 2018-10-18 18:00");
    }
}
