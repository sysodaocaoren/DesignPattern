package com.zym.demo.pattendemo.policy;

public class FlySytem {

    private String takeOffInfo;

    private String flyInfo;

    private Plane plane;

    public void setPlane(Plane plane) {
        this.plane = plane;
        this.takeOffInfo = plane.takeOff();
        this.flyInfo = plane.fly();
    }

    public void getTakeFlyInfo() {
        System.out.println("takeOff:" + takeOffInfo + ",flyInfo:" + flyInfo);
    }

    public String getTakeOffInfo() {
        return takeOffInfo;
    }

    public void setTakeOffInfo(String takeOffInfo) {
        this.takeOffInfo = takeOffInfo;
    }

    public String getFlyInfo() {
        return flyInfo;
    }

    public void setFlyInfo(String flyInfo) {
        this.flyInfo = flyInfo;
    }


}
