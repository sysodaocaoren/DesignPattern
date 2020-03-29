package com.zym.demo.pattendemo.simplefactory;

/**
 * 简单工厂模式
 * 需求：女娲造人，根据传入参数来决定造什么人
 * @Author zhuyumeng
 * @Since 2020年3月15日20:01:39
 */
public class Test {

    public static void main(String[] args){
        Nvwa nvwa = new Nvwa();
        human woman = nvwa.createMan("woman");
        woman.say();

        human man = nvwa.createMan("man");
        man.say();
    }
}
