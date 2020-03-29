package com.zym.demo.pattendemo.abstractfactory.windows;

import com.zym.demo.pattendemo.abstractfactory.InitInterface;

public class WindowsInitInterface implements InitInterface {

    @Override
    public void initInterFace() {
        System.out.println("windows init interface");
    }
}
