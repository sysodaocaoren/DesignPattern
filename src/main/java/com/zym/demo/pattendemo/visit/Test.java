package com.zym.demo.pattendemo.visit;

/**
 * 访问者模式
 * 需求：设计一个奖项评选系统，当教师发表的论文超过10篇或者学生论文超过两篇就可以评选科研奖，
 * 教师教学反馈分大于等于90分或者学生平举成绩大于等于90分可以评选成绩优秀奖。该系统可以评测该学生或者老师是否有资格获取某奖项
 * <p>
 * UML图： https://www.processon.com/view/link/5e95c31e7d9c0842ab39e55f
 *
 * @Author zhuyumeng
 * @Since 2020年4月14日21:39:37
 */
public class Test {

    public static void main(String[] args) {

        //声明候选人
        Teacher teacher1 = new Teacher(8, 93, "张三老师");
        Teacher teacher2 = new Teacher(13, 83, "李四老师");
        Teacher teacher3 = new Teacher(15, 98, "王五老师");

        Students students1 = new Students(1, 98, "小李同学");
        Students students2 = new Students(3, 88, "小网同学");
        Students students3 = new Students(3, 92, "小猪同学");

        //进入评选会场
        AwardCheckor awardCheckor = new AwardCheckor();
        awardCheckor.addPeople(teacher1);
        awardCheckor.addPeople(teacher2);
        awardCheckor.addPeople(teacher3);
        awardCheckor.addPeople(students1);
        awardCheckor.addPeople(students2);
        awardCheckor.addPeople(students3);

        //开始评选科研奖
        awardCheckor.check(new ResearchAward());

        //开始评选绩优奖
        awardCheckor.check(new ScoreAward());
    }
}
