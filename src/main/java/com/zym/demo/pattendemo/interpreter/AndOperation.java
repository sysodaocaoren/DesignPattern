package com.zym.demo.pattendemo.interpreter;

public class AndOperation implements Operation {

    private Operation left;

    private Operation right;

    public AndOperation(Operation left, Operation right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter() {
        if (left.interpreter() == right.interpreter()) {
            if (left.interpreter() == 1) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
