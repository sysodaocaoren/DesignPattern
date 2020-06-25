package com.zym.demo.pattendemo.command;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends Menu {


    public List<Menu> menus = new ArrayList<Menu>();

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void removeMenu(Menu menu) {
        menus.remove(menu);
    }

    @Override
    public void click() {
        System.out.println("i am mainMenu");
        menus.stream().map(x -> x.getName())
                .forEach(System.out::println);
    }
}
