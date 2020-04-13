package com.zym.demo.pattendemo.template;

public class UserUnit implements Defined {

    @Override
    public String query(String params) {
        return "Queryed by userunit,params:"+params;
    }
}
