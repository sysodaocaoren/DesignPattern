package com.zym.demo.pattendemo.command;

/**
 * 命令模式
 * 需求：要开发一个windows的界面，有一个主菜单，可以添加子菜单
 * 子菜单有click方法，可以执行打开，新建，编辑的命令
 *
 * 思路：采用命令模式
 * @Author zhuyumeng
 * @Since 2020年3月30日21:40:27
 */
public class Test {

    public static void main(String[] args) {
        //生成菜单
        MainMenu mainMenu = new MainMenu();
        MenuItem item1 = new MenuItem();
        item1.setName("item1");
        MenuItem item2 = new MenuItem();
        item2.setName("item2");
        //主菜单添加菜单
        mainMenu.addMenu(item1);
        mainMenu.addMenu(item2);

        //主菜单点击
        mainMenu.click();

        //设置命令
        item1.setCommand(new OpenCommand());
        item1.click();
        item1.setCommand(new CreateCommand());
        item1.click();
        item1.setCommand(new EditCommand());
        item1.click();
    }
}
