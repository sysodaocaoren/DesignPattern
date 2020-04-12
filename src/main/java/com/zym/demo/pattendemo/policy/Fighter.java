package com.zym.demo.pattendemo.policy;

public class Fighter implements Plane {
    @Override
    public String takeOff() {
        return "LongDistanceTakeOff";
    }

    @Override
    public String fly() {
        return "SuperSonicOff";
    }
}
