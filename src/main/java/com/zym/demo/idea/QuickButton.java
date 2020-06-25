package com.zym.demo.idea;

import java.util.ArrayList;
import java.util.List;

public class QuickButton {

    public QuickButton() {
        super();
    }

    public static void main(String[] ags) {
        System.out.println("111111");//sout+tab
        List<String> strLists = new ArrayList<String>();
        for (String strList : strLists) {//strList.f +tab
            System.out.println(strList);
        }
        String s = strLists.get(5);// strList.get(5).var+tab


    }
}
