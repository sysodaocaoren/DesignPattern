package com.zym.demo.pattendemo.decorator;

/**
 * 装饰模式
 * 需求：某公司开发了一套加密算法，需要对数据进行加密。先进行一次简单的加密，如果需要更严谨的就二次，三次加密
 * 请实现该加密规则
 * 思路：使用装饰模式
 * @Author zhuyumeng
 * @Since 2020年3月24日21:50:19
 *
 */
public class Test {
    public static void main(String[] args) {
        DecodeInit decodeInit = new DecodeInit();
        //进行一次加密
        decodeInit.decodeMethord();

        //进行两次加密
        DecoratorDecode1 decoratorDecode1 = new DecoratorDecode1(decodeInit);
        decoratorDecode1.decodeMethord();
    }
}
