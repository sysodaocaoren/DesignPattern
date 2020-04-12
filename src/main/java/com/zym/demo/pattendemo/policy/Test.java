package com.zym.demo.pattendemo.policy;

/**
 * 策略模式：
 * 需求，设计一个飞行模拟系统，直升机，科技，歼击机，鹞式战斗机的起飞特征和飞行特征都不一样
 *  用策略模式设计该系统
 * @author zhuyumeng
 * @Since 2020年4月12日21:19:29
 */
public class Test {

    public static void main(String[] args) {
        //声明一个模拟系统
        FlySytem flySytem = new FlySytem();


        //模拟直升机
        Helicopter helicopter = new Helicopter();
        flySytem.setPlane(helicopter);
        flySytem.getTakeFlyInfo();

        //模拟客机
        AirPlane airPlane = new AirPlane();
        flySytem.setPlane(airPlane);
        flySytem.getTakeFlyInfo();
    }
}
