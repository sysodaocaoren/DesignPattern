package com.zym.demo.pattendemo.visit;

public class Teacher implements People {

    private int paperCount;

    private int replyScore;

    private String name;


    public Teacher(int paperCount, int replyScore, String name) {
        this.paperCount = paperCount;
        this.replyScore = replyScore;
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

    public int getReplyScore() {
        return replyScore;
    }

    public void setReplyScore(int replyScore) {
        this.replyScore = replyScore;
    }

    @Override
    public void accept(AwardCheck awardCheck) {
        awardCheck.visit(this);
    }
}
