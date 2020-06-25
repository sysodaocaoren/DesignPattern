package com.zym.demo.pattendemo.observer;


import java.util.ArrayList;
import java.util.List;

public abstract class Hall {

    protected List<People> peopleList = new ArrayList<People>();

    public void addPeople(People people) {
        System.out.println("welcom " + people.getName() + "come in thisl hall ");
        peopleList.add(people);
    }

    public void removePeople(People people) {
        System.out.println("gun ba !!" + people.getName());
        peopleList.remove(people);
    }

    public abstract void notifyAllPeople(String mesage);
}
