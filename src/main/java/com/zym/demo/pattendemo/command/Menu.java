package com.zym.demo.pattendemo.command;

public abstract class Menu {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void click();

}
