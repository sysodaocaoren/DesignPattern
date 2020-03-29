package com.zym.demo.pattendemo.briage;

public class MysqlDataCovertor extends DataCovert {

    @Override
    public void covert() {
        fileCovertor.covertFile();
        System.out.println("saving data in mysql");
    }
}
