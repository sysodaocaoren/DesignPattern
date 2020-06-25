package com.zym.demo.pattendemo.observer;

public class ShareHall extends Hall {

    public void rongduanla() {
        notifyAllPeople("beng la !!");
    }

    @Override
    public void notifyAllPeople(String mesage) {
        peopleList.stream().forEach(x ->
                x.reviceMessage(mesage)
        );
    }
}
