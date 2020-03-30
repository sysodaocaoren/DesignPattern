package com.zym.demo.pattendemo.command;

public class MenuItem extends Menu {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    @Override
    public void click() {
        command.execute();
    }
}
