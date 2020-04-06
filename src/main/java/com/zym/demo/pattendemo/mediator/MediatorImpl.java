package com.zym.demo.pattendemo.mediator;

public class MediatorImpl implements  MediaInf {

    public  HuashiShow huashiShow;
    public SheshiShow sheshiShow;

    public GunDongComent gunDongComent;


    @Override
    public void momentChange(Moment moment) {
        if(moment == huashiShow){
            System.out.println("更改华氏温度数量到"+moment.wnedu);
            sheshiShow.update(moment.wnedu);
            gunDongComent.update(moment.wnedu);
        }else if( moment == sheshiShow){
            System.out.println("更改摄氏温度为"+moment.wnedu);
            huashiShow.update(moment.wnedu);
            gunDongComent.update(moment.wnedu);
        }else if(moment == gunDongComent){
            System.out.println("更改滚动条温度"+moment.wnedu);
            huashiShow.update(moment.wnedu);
            sheshiShow.update(moment.wnedu);
        }
    }
}
