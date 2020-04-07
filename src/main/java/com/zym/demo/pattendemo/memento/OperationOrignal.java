package com.zym.demo.pattendemo.memento;

public class OperationOrignal {

    private String operationName;

    public OperationOrignal(String name){
        this.operationName = name;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public void restore(MemontOperation memontOperation){
        this.operationName = memontOperation.getOperationName();
    }

    public MemontOperation createMementto(){
        return new MemontOperation(operationName);
    }

    public void reply(MemontOperation memontOperation){
        this.operationName = memontOperation.getOperationName();
    }

}
