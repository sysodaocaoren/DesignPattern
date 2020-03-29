package com.zym.demo.pattendemo.abstractfactory.android;

import com.zym.demo.pattendemo.abstractfactory.InitController;
import com.zym.demo.pattendemo.abstractfactory.InitInterface;
import com.zym.demo.pattendemo.abstractfactory.Platform;

public class AndroidPlatformFactory implements Platform {
    @Override
    public InitController createController() {
        return new AndroidInitController();
    }

    @Override
    public InitInterface createInterFace() {
        return new AndroidInitInterface();
    }
}
