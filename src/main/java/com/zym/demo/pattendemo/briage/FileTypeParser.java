package com.zym.demo.pattendemo.briage;

import java.util.stream.Stream;

public enum FileTypeParser {

    xml("com.zym.demo.pattendemo.briage.XmlFileCovertor"),
    pdf("com.zym.demo.pattendemo.briage.PdfFileCovertor"),
    sql("com.zym.demo.pattendemo.briage.SqlFileCovertor")
    ;

    private String name;

    FileTypeParser(String name) {
        this.name = name;
    }

    public static String getNameByValue(String value){

        return  Stream.of(FileTypeParser.values())
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
