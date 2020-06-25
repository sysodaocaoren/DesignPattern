package com.zym.demo.pattendemo.buildpatten;

import javafx.scene.media.MediaErrorEvent;

public class RemebModeBuilder extends Builder {

    MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    public void buildMainMode() {
        mediaPlayer.setMainMode(true);
    }

    @Override
    public void buildPlayMenu() {
        mediaPlayer.setShowMenu(false);
    }

    @Override
    public void buildShowMenu() {
        mediaPlayer.setShowMenu(true);
    }

    @Override
    public void buildControlBar() {
        mediaPlayer.setPlayMenu(false);
    }

    @Override
    public MediaPlayer getresult() {
        return mediaPlayer;
    }
}
