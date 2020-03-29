package com.zym.demo.pattendemo.abstractfactory;

/**
 * 抽象工厂模式
 * 需求：推出一款手机游戏，该手机游戏在不同的手机平台上操作界面和启动方式是不一样的，平台有
 *    android，ios，windows
 * 实现方式：抽象工厂模式
 * 实现效果：如果增加了一种平台类型，只需要增加类似于android文件夹里面的类，】
 * 并且在枚举类中维护上平台和工厂类的路径即可。不用动原来的其他代码.
 *
 * @Author zhuyumeng
 * @Since 2020年3月15日20:56:32
 */
public class Test {

    public static void main(String[] args){
        try{
            //String platform = "windows";
            String platform = "ios";
            //获取该平台的工厂方法
            Platform platformFactory = (Platform)Class.forName(PlatformTypeParser.getNameByValue(platform)).newInstance();
            //初始化界面
            InitInterface initInterface = platformFactory.createInterFace();
            initInterface.initInterFace();
            //初始化控制器
            InitController initController = platformFactory.createController();
            initController.initController();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
