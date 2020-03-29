package com.zym.demo.pattendemo.flyweight;


import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    Map<String,MediaInfo> cacheMap = new HashMap<String,MediaInfo>();

    private static FlyweightFactory instance = new FlyweightFactory();

    private FlyweightFactory(){

    }

    public static FlyweightFactory getInstance (){
        return instance;
    }

    public MediaInfo getMedia(String name){

        if(cacheMap.containsKey(name)){
            return cacheMap.get(name);
        }else{
            MediaInfo mediaInfo = new FileMedia(name);
            cacheMap.put(name,mediaInfo);
            return mediaInfo;
        }

    }

}
