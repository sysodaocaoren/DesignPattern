package com.zym.demo.pattendemo.abstractfactory.android;

import com.zym.demo.pattendemo.abstractfactory.InitInterface;

public class AndroidInitInterface implements InitInterface {
    @Override
    public void initInterFace() {
        System.out.println("android init interface");
    }
}
