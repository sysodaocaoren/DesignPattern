package com.zym.demo.pattendemo.protoType;

/**
 * 原型模式
 * 需求：有一个图表结构，里面有颜色，字体，内容。希望做一个按钮，点一下复制一个新的图表对象
 * <p>
 * 思路：采用原型模式
 */
public class Test {

    public static void main(String[] args) {
        ChartDemo chardemo = new ChartDemo();
        chardemo.setColor("red");
        chardemo.setContent("i am a red color");
        chardemo.setName("little red");
        ChartDemo demo2 = chardemo.clone();
        demo2.setName("black");
        demo2.setContent("i am black color");
        demo2.setName("little black");
        System.out.println(chardemo == demo2);
        System.out.println(chardemo.getName() + ":" + demo2.getName());
    }
}
