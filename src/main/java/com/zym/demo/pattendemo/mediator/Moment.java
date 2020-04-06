package com.zym.demo.pattendemo.mediator;

public abstract class Moment {

    protected MediaInf mediaInf;

    protected String wnedu;

    public void  setMedia(MediaInf mediaInf){
        this.mediaInf = mediaInf;
    }

    public void change(String wendu){
        this.wnedu=wendu;
        mediaInf.momentChange(this);
    }

    public abstract void update(String num);
}
