package com.dp.simple.section04;

/**
 * 由代理类来创建真实角色
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer player;

    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    @Override
    public void login(String user, String password) {
        this.player.login(user,password);
    }

    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    @Override
    public void upgrade() {
        this.player.upgrade();
    }
}
