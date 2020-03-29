package com.zym.demo.pattendemo.buildpatten;

public class MediaPlayer {

    private boolean mainMode;//主菜单

    private boolean playMenu;//播放列表

    private boolean showMenu;//显示菜单

    private boolean controlBar;//控制条

    public boolean isMainMode() {
        return mainMode;
    }

    public void setMainMode(boolean mainMode) {
        this.mainMode = mainMode;
    }

    public boolean isPlayMenu() {
        return playMenu;
    }

    public void setPlayMenu(boolean playMenu) {
        this.playMenu = playMenu;
    }

    public boolean isShowMenu() {
        return showMenu;
    }

    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }

    public boolean isControlBar() {
        return controlBar;
    }

    public void setControlBar(boolean controlBar) {
        this.controlBar = controlBar;
    }
}
