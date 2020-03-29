package com.zym.demo.pattendemo.chainresponsibility;

public class Yingzhang extends Officer {
    @Override
    public String consumerIntelligence(Intelligence intelligence) {
        if(intelligence.getCount() < 200){
            return "我是营长，开炮！！！";
        }else{
            return "人有点多，开个会吧！";
        }
    }
}
