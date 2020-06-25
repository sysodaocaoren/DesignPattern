package com.zym.demo.pattendemo.visit;

import javax.swing.plaf.PanelUI;

public class Students implements People {

    private String name;

    private int paperCount;

    private int score;

    public Students(int peparCount, int score, String name) {
        this.paperCount = peparCount;
        this.score = score;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(int paperCount) {
        this.paperCount = paperCount;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void accept(AwardCheck awardCheck) {
        awardCheck.visit(this);
    }
}
