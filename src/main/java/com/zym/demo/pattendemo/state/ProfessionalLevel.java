package com.zym.demo.pattendemo.state;

public class ProfessionalLevel extends GameLevel {

    public ProfessionalLevel(GameLevel gameLevel) {
        this.levelName = "专业选手";
        this.game = gameLevel.game;
    }

    @Override
    public void upLevel() {
        System.out.println("真牛啊，专业的啊你！！");
        game.setGameLevel(new FinalLevel(this));
    }

    @Override
    public void dowmLevel() {
        System.out.println("高手很多吧~~加油再来！");
        game.setGameLevel(new SecondLevel(this));
    }
}
