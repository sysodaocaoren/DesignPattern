package com.zym.demo.pattendemo.iterator;

public interface Iterator {

    public void next();

    public boolean isLast();

    public void previous();

    public Object getNextItem();

    public Object getPreviousItem();

}
