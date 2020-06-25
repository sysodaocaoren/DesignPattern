package com.zym.demo.pattendemo.command;

public class OpenCommand implements Command {

    private Operation operation;

    public OpenCommand() {
        operation = new OpenOperation();
    }

    @Override
    public void execute() {
        operation.operation();
    }
}
