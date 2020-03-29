package com.zym.demo.pattendemo.chainresponsibility;

public class Banzhang extends  Officer{

    @Override
    public String consumerIntelligence(Intelligence intelligence) {
        if(intelligence.getCount() < 10){
            return "我是班长，开炮！！！";
        }else{
            return this.office.consumerIntelligence(intelligence);
        }
    }
}
