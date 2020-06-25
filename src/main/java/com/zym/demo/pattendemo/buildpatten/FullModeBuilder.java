package com.zym.demo.pattendemo.buildpatten;

public class FullModeBuilder extends Builder {

    MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    public void buildMainMode() {
        mediaPlayer.setMainMode(true);
    }

    @Override
    public void buildPlayMenu() {
        mediaPlayer.setControlBar(true);
    }

    @Override
    public void buildShowMenu() {
        mediaPlayer.setPlayMenu(true);
    }

    @Override
    public void buildControlBar() {
        mediaPlayer.setShowMenu(true);
    }

    @Override
    public MediaPlayer getresult() {
        return mediaPlayer;
    }
}
