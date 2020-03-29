package com.zym.demo.pattendemo.decorator;

public class DecoratorDecode1 implements DecodeInterf {

    private DecodeInterf decodeInterf;

    public DecoratorDecode1(DecodeInterf decodeInterf){
        this.decodeInterf = decodeInterf;
    }

    @Override
    public void decodeMethord() {
        decodeInterf.decodeMethord();
        System.out.println("再进行进行一次加密");
    }
}
