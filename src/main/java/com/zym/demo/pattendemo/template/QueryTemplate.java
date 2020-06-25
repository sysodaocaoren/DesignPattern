package com.zym.demo.pattendemo.template;

public abstract class QueryTemplate {

    public abstract String query(String query);

    public void show(String content) {
        if (isDetail()) {
            System.out.println("show detail ,content:" + content);
        } else {
            System.out.println("shwo template,content:" + content);
        }
    }

    public boolean isDetail() {
        return true;
    }

    public void handle(String params) {
        //首先查询
        String content = query(params);
        //展示
        show(content);
    }
}
