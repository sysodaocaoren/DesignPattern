package com.zym.demo.pattendemo.template;

public class KeyWordsQuery extends QueryTemplate {

    @Override
    public String query(String query) {
        String params = query.replaceAll(" ", "");
        return "queryed by keyword,params: " + query;
    }

    @Override
    public boolean isDetail() {
        return false;
    }
}
