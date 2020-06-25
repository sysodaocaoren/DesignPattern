package com.zym.demo.testController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestZymController {

    @RequestMapping("test")
    public String testMethod() {
        return test("zym", "myz");
    }

    public String test(String a, String b) {
        return a + "222" + b;
    }


    public static String getStr(int a, int b, String c) {
        return Integer.toString(a) + ":vv:" + Integer.toString(b) + ":44:" + c;
    }

    public static void main(String[] args) {
        while (true) {
            int a = (int) Math.round(Math.random() * 1000000);
            int b = (int) Math.round(Math.random() * 1000000);
            System.out.println(getStr(a, b, "hello"));
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
