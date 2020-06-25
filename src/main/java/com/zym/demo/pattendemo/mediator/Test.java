package com.zym.demo.pattendemo.mediator;

/**
 * 中介者模式
 * 需求：有一个温度转换器，显式华氏温度和摄氏温度还有调节的欢动按钮，随意变动这三个中的一个其他两个都跟着变
 * 思路：使用中介者模式进行实现
 *
 * @Author zhuyumeng
 * @Since 2020年4月6日19:54:52
 */
public class Test {

    public static void main(String[] args) {
        //定义组件
        MediatorImpl mediator = new MediatorImpl();

        HuashiShow huashiShow = new HuashiShow();
        SheshiShow sheshiShow = new SheshiShow();
        GunDongComent gunDongComent = new GunDongComent();

        huashiShow.setMedia(mediator);
        sheshiShow.setMedia(mediator);
        gunDongComent.setMedia(mediator);

        mediator.sheshiShow = sheshiShow;
        mediator.huashiShow = huashiShow;
        mediator.gunDongComent = gunDongComent;

        huashiShow.change("39");
        sheshiShow.change("37");
        gunDongComent.change("60");
    }
}
