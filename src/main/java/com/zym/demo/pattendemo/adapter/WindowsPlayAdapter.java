package com.zym.demo.pattendemo.adapter;

public class WindowsPlayAdapter extends Player {

    WindowsMedisPlayer windowsMedisPlayer = null;

    @Override
    public void play() {
        windowsMedisPlayer = new WindowsMedisPlayer();
        windowsMedisPlayer.play();
    }
}
