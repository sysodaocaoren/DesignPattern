package com.zym.demo.pattendemo.iterator;


/**
 * 迭代器模式
 * 需求：用迭代器模式实现遥控器功能
 *
 * @Author zhuyumeng
 * @Since 2020年4月2日21:08:11
 */
public class Test {

    public static void main(String[] args) {
        control control = new control();
        Channel cctv1 = new Channel("ccctv1");
        Channel cctv2 = new Channel("ccctv2");
        Channel cctv3 = new Channel("ccctv3");
        Channel cctv4 = new Channel("ccctv4");
        Channel cctv5 = new Channel("ccctv5");
        Channel cctv6 = new Channel("ccctv6");
        control.addChannel(cctv1);
        control.addChannel(cctv2);
        control.addChannel(cctv3);
        control.addChannel(cctv4);
        control.addChannel(cctv5);
        control.addChannel(cctv6);
        ChannelIterator iterator = control.createIterator();
        System.out.println(iterator.getNextItem().getName());
        iterator.next();
        System.out.println(iterator.getNextItem().getName());
    }
}
