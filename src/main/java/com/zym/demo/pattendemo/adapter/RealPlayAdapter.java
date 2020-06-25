package com.zym.demo.pattendemo.adapter;

public class RealPlayAdapter extends Player {

    RealPlayer realPlayPlay = null;

    @Override
    public void play() {
        realPlayPlay = new RealPlayer();
        realPlayPlay.play();
    }
}
