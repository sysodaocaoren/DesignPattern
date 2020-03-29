package com.zym.demo.pattendemo.facade;

import java.util.stream.Stream;

public enum FacadeTypeParser {

    sd("com.zym.demo.pattendemo.facade.Bak4SD"),
    phone("com.zym.demo.pattendemo.facade.Bak4Phone")
    ;

    private String name;

    FacadeTypeParser(String name) {
        this.name = name;
    }

    public static String getNameByValue(String value){

        return  Stream.of(FacadeTypeParser.values())
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
