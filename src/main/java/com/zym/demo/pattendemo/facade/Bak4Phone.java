package com.zym.demo.pattendemo.facade;

public class Bak4Phone implements BakIntef {
    @Override
    public void bak() {
        Message message = new Message();
        Photo photo = new Photo();
        Songs songs = new Songs();

        message.bak2Phone();
        photo.bak2Phone();
        songs.bak2Phone();
    }
}
