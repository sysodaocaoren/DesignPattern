package com.zym.demo.pattendemo.abstractfactory.android;

import com.zym.demo.pattendemo.abstractfactory.InitController;

public class AndroidInitController implements InitController {
    @Override
    public void initController() {
        System.out.println("init android controller");
    }
}
