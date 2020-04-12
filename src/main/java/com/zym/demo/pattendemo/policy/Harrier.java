package com.zym.demo.pattendemo.policy;

public class Harrier implements Plane {
    @Override
    public String takeOff() {
        return "VerticalTakeOff";
    }

    @Override
    public String fly() {
        return "SuperSonicFly";
    }
}
