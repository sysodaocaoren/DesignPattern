package com.zym.demo.pattendemo.buildpatten;

public class SimplateModeBuilder extends Builder {

    MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    public void buildMainMode() {
        mediaPlayer.setMainMode(true);
    }

    @Override
    public void buildPlayMenu() {
        mediaPlayer.setPlayMenu(false);
    }

    @Override
    public void buildShowMenu() {
        mediaPlayer.setShowMenu(false);
    }

    @Override
    public void buildControlBar() {
        mediaPlayer.setControlBar(true);
    }

    @Override
    public MediaPlayer getresult() {
        return mediaPlayer;
    }
}
