package com.zym.demo.pattendemo.observer;

/**
 * 观察者模式
 * 需求：当顾客购买的股票变化幅度大于5%时，就通知所有购买的人
 * @Author zhuyumeng
 * @Since 2020年4月9日21:15:36
 */
public class Test {

    public static void main(String[] args) {
        //先成立股票大厅
        ShareHall shareHall = new ShareHall();

        //彩民蜂拥而至
        People zhangsan = new People("zhangsan");
        People lisi = new People("lisi");
        People wangwu = new People("wangwu");
        People chengliu = new People("chengliu");

        //疯狂的注册彩票
        shareHall.addPeople(zhangsan);
        shareHall.addPeople(lisi);
        shareHall.addPeople(wangwu);
        shareHall.addPeople(chengliu);

        //股票崩了！！
        shareHall.rongduanla();

        //张三跑了，其他的还在坚持,又熔断啦！！
        shareHall.removePeople(zhangsan);
        shareHall.rongduanla();

        //sunba 想抄底，加入了股票大会，又又又崩啦！！
        People sunba = new People("sunba");
        shareHall.addPeople(sunba);
        shareHall.rongduanla();
    }
}
