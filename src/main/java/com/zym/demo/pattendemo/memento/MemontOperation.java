package com.zym.demo.pattendemo.memento;

public class MemontOperation {

    private String operationName;

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public MemontOperation(String name){
        this.operationName = name;
    }
}
