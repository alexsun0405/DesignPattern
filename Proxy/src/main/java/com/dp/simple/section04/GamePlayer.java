package com.dp.simple.section04;

/**
 * 强制使用代理才能调用方法
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    private IGamePlayer proxy;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if (!isProxy()) {
            System.out.println("请使用代理访问");
        } else {
            System.out.println("登录名为 " + user + " 的用户 " + name + " 登录成功!");
        }
    }

    @Override
    public void killBoss() {
        if (!isProxy()) {
            System.out.println("请使用代理访问");
        } else {
            System.out.println(name + " 在打怪!");
        }
    }

    @Override
    public void upgrade() {
        if (!isProxy()) {
            System.out.println("请使用代理访问");
        }else {
            System.out.println(name + " 升级了!");
        }
    }

    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return proxy;
    }

    private boolean isProxy() {
        return this.proxy != null;
    }
}
