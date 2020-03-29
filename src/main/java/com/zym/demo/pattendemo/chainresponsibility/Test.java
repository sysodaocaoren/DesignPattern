package com.zym.demo.pattendemo.chainresponsibility;

import com.zym.demo.pattendemo.composite.Office;

/**
 * 职责链模式
 * 需求：某军队内部有规定，根据侦察到的敌人的数量来请求上级军官是否需要打仗，规则如下：
 * 小于10个，班长即可决定
 * 大于10个小于50个，排长决定
 * 大于50个小于200个营长可以决定
 * 大于200个，需要开会决定
 * 思路：用职责链模式开发
 * @Author zhuyumeng
 * @Since 2020年3月29日20:18:43
 */
public class Test {
    public static void main(String[] args) {
        //形成职责链
        Officer banzhang = new Banzhang();
        Officer paizhang = new Paizhang();
        Officer yingzhang = new Yingzhang();

        banzhang.setOffice(paizhang);
        paizhang.setOffice(yingzhang);
        //声明消息类
        Intelligence intelligence = new Intelligence();
        intelligence.setCount(1118);

        System.out.println(banzhang.consumerIntelligence(intelligence));

    }
}
