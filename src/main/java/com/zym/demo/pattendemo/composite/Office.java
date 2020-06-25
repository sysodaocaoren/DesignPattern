package com.zym.demo.pattendemo.composite;

public class Office implements OfficeInter {

    private String officeName;

    public Office(String OfficeName) {
        this.officeName = OfficeName;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    @Override
    public void revice(String message) {
        System.out.println("i am " + officeName + " office ,i revice your message :" + message);
    }
}
