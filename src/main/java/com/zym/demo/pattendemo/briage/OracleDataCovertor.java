package com.zym.demo.pattendemo.briage;

public class OracleDataCovertor extends DataCovert {
    @Override
    public void covert() {
        super.fileCovertor.covertFile();
        System.out.println("oracle saving data");
    }
}
