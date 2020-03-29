package com.zym.demo.pattendemo.factory;

public class ExcelParserFactory implements Parsefactory {
    @Override
    public Parser createParser() {
        return new ExcelParser();
    }
}
