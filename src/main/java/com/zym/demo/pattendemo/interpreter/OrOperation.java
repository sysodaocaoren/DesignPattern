package com.zym.demo.pattendemo.interpreter;

public class OrOperation implements  Operation {

    private Operation left;

    private Operation right;

    public OrOperation(Operation left, Operation right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter() {
        if(left.interpreter() == right.interpreter()){
            if(left.interpreter() == 0){
                return 0;
            }else{
                return 1;
            }
        }else{
            return 1;
        }
    }
}
