package com.zym.demo.pattendemo.observer;

public class People {
    private String name;

    public  People(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void reviceMessage(String message){
        System.out.println(name+"收到了消息："+message);
    }
}
