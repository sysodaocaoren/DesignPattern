package com.zym.demo.pattendemo.command;

public class EditCommand implements Command {

    private Operation operation;

    public EditCommand() {
        operation = new EditOperation();
    }

    @Override
    public void execute() {
        operation.operation();
    }
}
