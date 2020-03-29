package com.zym.demo.pattendemo.factory;

public class SqlParserFactory implements  Parsefactory {
    @Override
    public Parser createParser() {
        return new SqlParser();
    }
}
