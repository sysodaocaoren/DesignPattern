package com.zym.demo.pattendemo.state;

public abstract class GameLevel {

    protected String levelName;

    protected Game game;

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public abstract void upLevel();

    public abstract  void dowmLevel();

    public void showLevel(){
        System.out.println("now level : "+levelName);
    }
}
