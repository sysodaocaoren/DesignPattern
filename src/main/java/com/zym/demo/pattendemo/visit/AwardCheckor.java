package com.zym.demo.pattendemo.visit;

import java.util.ArrayList;
import java.util.List;

public class AwardCheckor {

    private List<People> peopleList = new ArrayList<People>();

    public void addPeople(People people) {
        peopleList.add(people);
    }

    public void check(AwardCheck check) {
        peopleList.stream().forEach(x -> x.accept(check));
    }
}
