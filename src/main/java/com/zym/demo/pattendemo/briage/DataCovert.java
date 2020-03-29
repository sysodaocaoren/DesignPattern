package com.zym.demo.pattendemo.briage;

public abstract class DataCovert {

    protected FileCovertor fileCovertor;

    public void setFileCovertor(FileCovertor fileCovertor) {
        this.fileCovertor = fileCovertor;
    }

    public abstract void covert();
}
