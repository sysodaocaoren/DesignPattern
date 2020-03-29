package com.zym.demo.pattendemo.flyweight;

public abstract class MediaInfo {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void show(ExtInfo extInfo);
}
