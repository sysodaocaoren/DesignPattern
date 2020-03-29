package com.zym.demo.pattendemo.chainresponsibility;

public class Paizhang extends  Officer {
    @Override
    public String consumerIntelligence(Intelligence intelligence) {
        if(intelligence.getCount() < 50){
            return "我是排长。开炮！！！！";
        }else{
            return office.consumerIntelligence(intelligence);
        }
    }
}
