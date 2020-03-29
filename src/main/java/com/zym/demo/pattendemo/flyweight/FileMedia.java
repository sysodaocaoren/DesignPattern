package com.zym.demo.pattendemo.flyweight;

public class FileMedia extends  MediaInfo {

    public FileMedia(String name){
        name = name;
    }

    @Override
    public void show(ExtInfo extInfo) {
        System.out.println("i am file media:"+name+",my position x,y:"
                +extInfo.getX()+","+extInfo.getY()
                +";my height,width:"+extInfo.getHeight()+","+extInfo.getWidth());
    }
}
