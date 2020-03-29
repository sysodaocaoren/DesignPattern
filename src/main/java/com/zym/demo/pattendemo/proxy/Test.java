package com.zym.demo.pattendemo.proxy;

/**
 * 代理模式
 * 需求：某公司需要开发一个图片加载器，图片下载时先展示小图标，后台下载真实数据
 * 思路：用代理模式实现
 */
public class Test {

    public static void main(String[] args) {
        String url = "";

        Picture picture = new ProxyPicture();
        picture.show(url);
    }
}
