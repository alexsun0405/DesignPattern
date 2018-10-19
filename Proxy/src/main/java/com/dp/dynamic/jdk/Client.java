package com.dp.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayerIH(player);
        System.out.println("开始时间 2018-10-18 17:00");
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(player.getClass().getClassLoader(), player.getClass().getInterfaces(), handler);
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间 2018-10-18 18:00");
    }
}
