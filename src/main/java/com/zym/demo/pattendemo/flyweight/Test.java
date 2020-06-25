package com.zym.demo.pattendemo.flyweight;

/**
 * 享元模式
 * 需求：要开发一个多功能的文档编辑器，可以编辑图片，文档，动画等，为了节省开支，每种相同的资源只存一份
 * 并且他们每次出现的位置和大小均不同
 * 思路：使用享元模式实现
 *
 * @Author zhuyumeng
 * @Since 2020年3月26日23:18:40
 */
public class Test {

    public static void main(String[] args) {

        MediaInfo helloCatty = FlyweightFactory.getInstance().getMedia("helloCatty");
        MediaInfo helloCatty2 = FlyweightFactory.getInstance().getMedia("helloCatty");
        MediaInfo helloCatty3 = FlyweightFactory.getInstance().getMedia("helloCatty");

        System.out.println(helloCatty == helloCatty2);
        System.out.println(helloCatty2 == helloCatty3);

        helloCatty.show(new ExtInfo(2, 3, 4, 5));
        helloCatty.show(new ExtInfo(3, 4, 5, 6));
        helloCatty.show(new ExtInfo(4, 5, 6, 7));
    }
}
