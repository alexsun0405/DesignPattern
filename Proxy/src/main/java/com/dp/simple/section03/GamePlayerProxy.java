package com.dp.simple.section03;

/**
 * 由代理类来创建真实角色
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer player;

    public GamePlayerProxy(String name) {
        try {
            this.player = new GamePlayer(this, name);
        } catch (Exception e) {
            //处理异常
        }
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
