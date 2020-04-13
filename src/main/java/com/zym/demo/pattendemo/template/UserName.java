package com.zym.demo.pattendemo.template;

public class UserName implements Defined {
    @Override
    public String query(String params) {
        return "queryed by username,params"+params;
    }
}
