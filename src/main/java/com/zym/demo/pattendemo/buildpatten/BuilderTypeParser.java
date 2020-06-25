package com.zym.demo.pattendemo.buildpatten;

import java.util.stream.Stream;

public enum BuilderTypeParser {

    full("com.zym.demo.pattendemo.buildpatten.FullModeBuilder"),
    simple("com.zym.demo.pattendemo.buildpatten.SimplateModeBuilder"),
    remeb("com.zym.demo.pattendemo.buildpatten.RemebModeBuilder"),
    net("com.zym.demo.pattendemo.buildpatten.NetBuilder");

    private String name;

    BuilderTypeParser(String name) {
        this.name = name;
    }

    public static String getNameByValue(String value) {

        return Stream.of(BuilderTypeParser.values())
                .filter(x -> value.equals(x.toString()))
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
