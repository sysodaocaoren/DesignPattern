package com.zym.demo.pattendemo.policy;

public class Helicopter implements Plane {
    @Override
    public String takeOff() {
        return "VerticalTakeOff";
    }

    @Override
    public String fly() {
        return "SubSonicFly";
    }
}
