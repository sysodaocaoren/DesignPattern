package com.zym.demo.pattendemo.adapter;

/**
 * 适配器模式
 * 需求：windows media和realPlay是两种不同的播放器，要求，写一个类可以支持这两种api
 * 思路：用适配器模式
 *
 * @Author zhuyumeng
 * @Since 2020年3月19日22:02:37
 */
public class Test {

    public static void main(String[] args) {

        //动态配置适配器，即可动态调用原有的方法，新加一个方法就新写一个适配器，不用改原来的
        Player play = new WindowsPlayAdapter();
        play.play();
    }


}
