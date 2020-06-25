package com.zym.demo.pattendemo.command;

public class CreateCommand implements Command {

    private Operation operation;

    public CreateCommand() {
        operation = new CreateOperation();
    }

    @Override
    public void execute() {
        operation.operation();
    }
}
