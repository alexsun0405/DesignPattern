package com.dp.simple.section03;

/**
 * 不能直接创建真实角色
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(IGamePlayer player,String name) {
        if (player == null) {
            throw new RuntimeException("不能创建真实角色");
        } else {
            this.name = name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为 " + user + " 的用户 " + name + " 登录成功!");
    }

    @Override
    public void killBoss() {
        System.out.println(name + " 在打怪!");
    }

    @Override
    public void upgrade() {
        System.out.println(name + " 升级了!");
    }
}
