package com.dp.simple.section03;

public class Client {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("张三");
        // 代理执行
        System.out.println("开始时间 2018-10-18 17:00");
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间 2018-10-18 18:00");
    }
}
