package com.zym.demo.pattendemo.abstractfactory.ios;

import com.zym.demo.pattendemo.abstractfactory.InitInterface;

public class IOSInitInterface implements InitInterface {
    @Override
    public void initInterFace() {
        System.out.println("ios init interface");
    }
}
