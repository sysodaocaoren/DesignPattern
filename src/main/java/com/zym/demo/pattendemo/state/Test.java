package com.zym.demo.pattendemo.state;

/**
 * 状态模式
 * 需求：某游戏赢了可以赚积分，根据积分分为入门级，熟练级，高手级，骨灰级，每一个层级可以玩的权限不一样
 *      用状态模式实现该需求
 * @Author zhuyumeng
 * @Since 2020年4月11日22:40:58
 */
public class Test {
    public static void main(String[] args) {
        //打开游戏
        Game game = new Game();
        System.out.println(game.getGameLevel().getLevelName());

        //玩了一会升级了
        game.updateLevel();

        //又升级了
        game.updateLevel();

        //队友太坑！！掉分了
        game.downLevel();

        //找人开黑
        game.updateLevel();
        game.updateLevel();
        game.updateLevel();
        System.out.println(game.getGameLevel().getLevelName());

    }
}
