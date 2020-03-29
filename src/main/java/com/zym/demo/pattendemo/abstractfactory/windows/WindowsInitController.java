package com.zym.demo.pattendemo.abstractfactory.windows;

import com.zym.demo.pattendemo.abstractfactory.InitController;

public class WindowsInitController implements InitController {
    @Override
    public void initController() {
        System.out.println("windows init controller");
    }
}
