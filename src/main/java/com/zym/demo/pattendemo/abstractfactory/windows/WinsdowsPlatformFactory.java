package com.zym.demo.pattendemo.abstractfactory.windows;

import com.zym.demo.pattendemo.abstractfactory.InitController;
import com.zym.demo.pattendemo.abstractfactory.InitInterface;
import com.zym.demo.pattendemo.abstractfactory.Platform;

public class WinsdowsPlatformFactory implements Platform {

    @Override
    public InitController createController() {
        return new WindowsInitController();
    }

    @Override
    public InitInterface createInterFace() {
        return new WindowsInitInterface();
    }
}
