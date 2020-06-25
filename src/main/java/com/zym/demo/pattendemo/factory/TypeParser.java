package com.zym.demo.pattendemo.factory;

import java.util.stream.Stream;

public enum TypeParser {

    txt("com.zym.demo.pattendemo.factory.TxtParserFactory"),
    sql("com.zym.demo.pattendemo.factory.SqlParserFactory"),
    excel("com.zym.demo.pattendemo.factory.ExcelParserFactory");

    private String name;

    TypeParser(String name) {
        this.name = name;
    }

    public static String getNameByValue(String value) {

        return Stream.of(TypeParser.values())
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
