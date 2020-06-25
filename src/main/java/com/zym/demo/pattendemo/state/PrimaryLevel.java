package com.zym.demo.pattendemo.state;

public class PrimaryLevel extends GameLevel {

    public PrimaryLevel(Game game) {
        this.levelName = "初级选手";
        this.game = game;
    }

    @Override
    public void upLevel() {
        System.out.println("恭喜您，成为熟练玩家");
        game.setGameLevel(new SecondLevel(this));
    }

    @Override
    public void dowmLevel() {
        System.out.println("不用害怕，初级玩家不会掉分的~~");
    }
}
