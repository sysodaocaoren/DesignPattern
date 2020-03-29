package com.zym.demo.pattendemo.proxy;

public class ProxyPicture implements Picture {

    private PictureReal pictureReal = new PictureReal();

    @Override
    public void show(String url) {

        System.out.println("picture show little logo");

        new Thread(()->{
            try {
                int count = 1;
                while (count < 6){
                    System.out.println("picture download "+count*20+"%");
                    Thread.sleep(2000);
                    count ++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pictureReal.show(url);
        }).start();

    }
}
