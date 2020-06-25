package com.zym.demo.pattendemo.proxy;

public class PictureReal implements Picture {

    @Override
    public void show(String url) {
        System.out.println("picture complete show");
    }
}
