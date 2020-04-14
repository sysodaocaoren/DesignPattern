package com.zym.demo.pattendemo.visit;

public class ScoreAward implements AwardCheck {

    @Override
    public void visit(Students students) {
        if(students.getScore() >= 90){
            System.out.println(students.getName()+",恭喜您，获得了绩优奖！！");
        }else{
            System.out.println(students.getName()+",很遗憾，多学学习吧！！");
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if(teacher.getReplyScore() >= 90){
            System.out.println(teacher.getName()+",恭喜您，获得了绩优奖！！");
        }else{
            System.out.println(teacher.getName()+",很遗憾，分数不够！！");
        }
    }
}
