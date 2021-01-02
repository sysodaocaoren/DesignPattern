package com.zym.demo.pattendemo.state;

/**
 * 游戏类
 */
public class Game {

    private GameLevel gameLevel;

    public GameLevel getGameLevel() {
        return gameLevel;
    }

    public void setGameLevel(GameLevel gameLevel) {
        this.gameLevel = gameLevel;
    }

    public Game() {
        gameLevel = new PrimaryLevel(this);
    }

    public void updateLevel() {
        System.out.println("升级了");
        gameLevel.upLevel();
    }

    public void downLevel() {
        System.out.println("掉分了");
        gameLevel.dowmLevel();
    }
}
