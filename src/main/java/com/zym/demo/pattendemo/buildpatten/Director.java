package com.zym.demo.pattendemo.buildpatten;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public MediaPlayer contructor(){
        builder.buildMainMode();
        builder.buildPlayMenu();
        builder.buildShowMenu();
        builder.buildControlBar();
        return builder.getresult();
    }
}
