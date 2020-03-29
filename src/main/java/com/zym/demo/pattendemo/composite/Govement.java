package com.zym.demo.pattendemo.composite;

import java.util.ArrayList;
import java.util.List;

public class Govement implements OfficeInter {

    private List<OfficeInter> offices = new ArrayList<OfficeInter>();

    private String GovermentName;

    public void addOffice(OfficeInter officeInter){
        offices.add(officeInter);
    }

    public void removeOffice(OfficeInter officeInter){
        offices.remove(officeInter);
    }

    public Govement(String name){
        this.GovermentName = name;
    }

    public String getGovermentName() {
        return GovermentName;
    }

    public void setGovermentName(String govermentName) {
        GovermentName = govermentName;
    }

    @Override
    public void revice(String message) {
        System.out.println("i am "+GovermentName+",irevice your message"+message+".i begin send message ~");
        this.offices.stream().forEach(x -> x.revice(message));
    }
}
