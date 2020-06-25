package com.zym.demo.pattendemo.buildpatten;

/**
 * 建造者模式
 * 需求：需要创建一个视频播放器，视频播放器有很多种模式：
 * 1.完整模式：有菜单，播放列表，主窗口，控制条
 * 2.精简模式：只有主窗口和控制条
 * 3.记忆模式：主窗口，控制条，收藏列表
 * 思路：采用建造者模式来实现三种模式的建造，各自的建造类在枚举值中维护
 *
 * @Author zhuyumeng
 * @Since 2020年3月16日21:56:05
 */
public class Test {

    public static void main(String[] args) {
        try {
            String type = "net";
            Builder builder = (Builder) Class.forName(BuilderTypeParser.getNameByValue(type)).newInstance();
            Director director = new Director(builder);
            MediaPlayer mediaPlayer = director.contructor();
            System.out.println("controlBar:" + mediaPlayer.isControlBar());
            System.out.println("mainMode:" + mediaPlayer.isMainMode());
            System.out.println("showMenu:" + mediaPlayer.isShowMenu());
            System.out.println("playMenu:" + mediaPlayer.isPlayMenu());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
