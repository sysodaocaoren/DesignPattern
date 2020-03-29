package com.zym.demo.pattendemo.abstractfactory.ios;

import com.zym.demo.pattendemo.abstractfactory.InitController;

public class IOSInitController implements InitController {
    @Override
    public void initController() {
        System.out.println("IOS init controller");
    }
}
