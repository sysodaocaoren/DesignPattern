package com.zym.demo.pattendemo.state;

public class SecondLevel extends GameLevel {

    public SecondLevel(GameLevel gameLevel) {
        this.levelName = "熟练选手";
        this.game = gameLevel.game;
    }

    @Override
    public void upLevel() {
        System.out.println("又升级了！！高手了哎！");
        game.setGameLevel(new ProfessionalLevel(this));
    }

    @Override
    public void dowmLevel() {
        System.out.println("没关系，从初级玩家开始找寻游戏的乐趣吧~~");
        game.setGameLevel(new PrimaryLevel(this.game));
    }
}
