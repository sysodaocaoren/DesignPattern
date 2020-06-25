package com.zym.demo.executortest;

import java.util.concurrent.Callable;

public class ThreadTest implements Callable<String> {

    private String params;

    ThreadTest(String params){
        this.params=params;
    }


    @Override
    public String call() throws Exception {
        Thread.currentThread().sleep(Math.round(Math.random()*10000));
        return Thread.currentThread().getName()+params;
    }
}
