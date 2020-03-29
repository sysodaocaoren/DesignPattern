package com.zym.demo.pattendemo.abstractfactory;

import java.util.stream.Stream;

public enum PlatformTypeParser {

    windows("com.zym.demo.pattendemo.abstractfactory.windows.WinsdowsPlatformFactory"),
    ios("com.zym.demo.pattendemo.abstractfactory.ios.IOSPlatformFactory"),
    android("com.zym.demo.pattendemo.abstractfactory.android.AndroidPlatformFactory")
    ;

    private String name;

    PlatformTypeParser(String name) {
        this.name = name;
    }

    public static String getNameByValue(String value){

        return  Stream.of(PlatformTypeParser.values())
                .filter(x ->value.equals(x.toString()))
                .findFirst()
                .get()
                .getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
