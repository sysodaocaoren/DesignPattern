package com.zym.demo.pattendemo.facade;

/**
 * 外观模式
 * 需求：要开发一个手机一键备份的功能，需要将短信，照片，歌曲等信息都存储到内存卡或者手机卡中
 * 思路: 用外观模式实现该功能，设计备份抽象类，往存储卡和手机卡是两个实现方法
 * @Author zhuyumeng
 * @Since 2020年3月25日21:05:48
 */
public class Test {

    public static void main(String[] args) {

        String type ="phone";
        try {
            BakIntef backBean = (BakIntef) Class.forName(FacadeTypeParser.getNameByValue(type)).newInstance();
            backBean.bak();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
