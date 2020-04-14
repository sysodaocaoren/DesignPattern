package com.zym.demo.pattendemo.visit;

public class ResearchAward  implements  AwardCheck{

    @Override
    public void visit(Students students) {
        if(students.getPaperCount() > 2){
            System.out.println(students.getName()+",恭喜您，获取了科研奖！！");
        }else{
            System.out.println(students.getName()+",很遗憾，多写论文吧！！");
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if(teacher.getPaperCount() > 10){
            System.out.println(teacher.getName()+",恭喜您，获取了科研奖");
        }else{
            System.out.println(teacher.getName()+",很遗憾，别玩了多写论文吧！！");
        }
    }
}
