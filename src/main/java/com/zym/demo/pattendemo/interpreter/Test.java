package com.zym.demo.pattendemo.interpreter;

/**
 * 解释器模式
 * 需求：要求用解释器模式来实现 1 and 0，1 or 0的运算
 * @Author zhuyumeng
 * @Since 2020年3月31日22:04:42
 */
public class Test {

    public static void main(String[] args) {

        OperationHandle handle = new OperationHandle();
        String str1 = "1 and 1";
        String str2 = "0 and 1";
        String str3 = "1 or 1";
        String str4 = "0 or 1 and 1 or 1";
        String str5 = "1 or 0 and 1 and 0 or 0";
        handle.handle(str1);
        handle.handle(str2);
        handle.handle(str3);
        handle.handle(str4);
        handle.handle(str5);
    }
}
