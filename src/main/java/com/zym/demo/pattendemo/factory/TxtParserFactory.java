package com.zym.demo.pattendemo.factory;

public class TxtParserFactory implements Parsefactory {

    @Override
    public Parser createParser() {
        return new TxtParser();
    }
}
