package com.zym.demo.executortest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Test {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(20);
        List<Future<String>> resList = new ArrayList<Future<String>>();
        for(int i =0;i<20;i++){
            Future<String> str = exec.submit(new ThreadTest("hello"));
            resList.add(str);
        }
        boolean endflag = true;
        while (true){
            for(int i = 0;i <resList.size(); i++){
                Future<String> feature = resList.get(i);
                if(feature.isDone()){
                    resList.remove(i);
                    i --;
                    System.out.println(feature.get());
                }else{
                    endflag = false;
                }
            }
            if(endflag){
                break;
            }
        }
    }
}
