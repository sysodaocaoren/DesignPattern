package com.zym.demo.pattendemo.state;

public class FinalLevel extends GameLevel {

    public FinalLevel(GameLevel gameLevel) {
        this.levelName = "骨灰选手";
        this.game = gameLevel.game;
    }

    @Override
    public void upLevel() {
        System.out.println(" you are best !!");
    }

    @Override
    public void dowmLevel() {
        System.out.println("每一个专业选手都曾掉过骨灰段位！！");
        game.setGameLevel(new ProfessionalLevel(this));
    }
}
