package com.zym.demo.pattendemo.facade;

public class Bak4SD implements BakIntef {

    @Override
    public void bak() {
        Message message = new Message();
        Photo photo = new Photo();
        Songs songs = new Songs();

        message.bak2SD();
        photo.bak2SD();
        songs.bak2SD();
    }
}
