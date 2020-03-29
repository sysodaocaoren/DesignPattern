package com.zym.demo.pattendemo.abstractfactory.ios;

import com.zym.demo.pattendemo.abstractfactory.InitController;
import com.zym.demo.pattendemo.abstractfactory.InitInterface;
import com.zym.demo.pattendemo.abstractfactory.Platform;

public class IOSPlatformFactory implements Platform {

    @Override
    public InitController createController() {
        return new IOSInitController();
    }

    @Override
    public InitInterface createInterFace() {
        return new IOSInitInterface();
    }
}
