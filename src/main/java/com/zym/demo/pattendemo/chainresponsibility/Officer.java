package com.zym.demo.pattendemo.chainresponsibility;

public abstract class Officer {

    protected Officer office;

    public void setOffice(Officer office) {
        this.office = office;
    }

    public abstract String consumerIntelligence(Intelligence intelligence);
}
