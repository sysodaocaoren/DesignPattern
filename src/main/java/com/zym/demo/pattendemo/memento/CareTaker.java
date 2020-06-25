package com.zym.demo.pattendemo.memento;

import javafx.print.Collation;
import org.springframework.util.CollectionUtils;

import java.util.Stack;

public class CareTaker {

    private Stack<MemontOperation> restoreStack = new Stack<>();

    private Stack<MemontOperation> replyStack = new Stack<>();

    public MemontOperation addRestore(MemontOperation memontOperation) {
        return restoreStack.push(memontOperation);
    }

    public MemontOperation restore() {
        if (CollectionUtils.isEmpty(restoreStack)) {
            System.out.println("no operation can be restore");
        }
        MemontOperation memontOperation = restoreStack.pop();
        replyStack.push(memontOperation);
        return memontOperation;
    }

    public MemontOperation reply() {
        if (CollectionUtils.isEmpty(replyStack)) {
            System.out.println("no operation can be reply");
        }
        MemontOperation memontOperation = replyStack.pop();
        restoreStack.push(memontOperation);
        return memontOperation;
    }
}
