package com.zym.demo.pattendemo.composite;

/**
 * 组合模式
 * 需求：oa系统可以给各级办公室发送公文，但是办公室比较复杂
 * 思路：利用组合模式
 *
 * @Author zhuyumeng
 * @Since 2020年3月23日22:06:16
 */
public class Test {

    public static void main(String[] args) {
        //声明办公室
        Govement beijingHead = new Govement("北京总部");
        Govement changsha = new Govement("长沙教学点");
        Govement hunan = new Govement("湖南分校");
        Govement xiangtan = new Govement("湘潭教学点");
        OfficeInter jiaowu = new Office("教务办公室");
        OfficeInter xingzheng = new Office("行政办公室");

        //组合
        beijingHead.addOffice(jiaowu);
        beijingHead.addOffice(xingzheng);
        beijingHead.addOffice(hunan);
        hunan.addOffice(jiaowu);
        hunan.addOffice(xingzheng);
        hunan.addOffice(changsha);
        changsha.addOffice(xingzheng);
        changsha.addOffice(jiaowu);
        hunan.addOffice(xiangtan);
        xiangtan.addOffice(xingzheng);
        xiangtan.addOffice(jiaowu);

        beijingHead.revice("开学啦！！！！");
    }
}
