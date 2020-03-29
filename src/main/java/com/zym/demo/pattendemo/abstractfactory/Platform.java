package com.zym.demo.pattendemo.abstractfactory;

public interface Platform {
    InitController createController();
    InitInterface createInterFace();
}
