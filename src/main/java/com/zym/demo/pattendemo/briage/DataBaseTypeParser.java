package com.zym.demo.pattendemo.briage;

import java.util.stream.Stream;

public enum DataBaseTypeParser {

    mysql("com.zym.demo.pattendemo.briage.MysqlDataCovertor"),
    oracle("com.zym.demo.pattendemo.briage.OracleDataCovertor");

    private String name;

    DataBaseTypeParser(String name) {
        this.name = name;
    }

    public static String getNameByValue(String value) {

        return Stream.of(DataBaseTypeParser.values())
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
