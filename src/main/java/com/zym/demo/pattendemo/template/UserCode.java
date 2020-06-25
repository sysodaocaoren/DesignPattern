package com.zym.demo.pattendemo.template;

public class UserCode implements Defined {
    @Override
    public String query(String params) {
        return "queryed by userCode,params :" + params;
    }
}
