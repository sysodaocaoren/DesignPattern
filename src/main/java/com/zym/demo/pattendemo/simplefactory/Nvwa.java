package com.zym.demo.pattendemo.simplefactory;

public class Nvwa {

    public human createMan (String type){
        if("woman".equals(type)){
            return new woman();
        }else if("man".equals(type)){
            return new man();
        } else{
            return new human();
        }
    }
}
